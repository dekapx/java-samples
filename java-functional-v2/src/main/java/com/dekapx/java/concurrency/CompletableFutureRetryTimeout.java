package com.dekapx.java.concurrency;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureRetryTimeout {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        try {
            String result = runWithRetryAndTimeout(() -> simulateTask("Hello", 2), 3, 1, 3, TimeUnit.SECONDS)
                    .get();
            System.out.println("Final Result: " + result);
        } catch (Exception e) {
            System.out.println("Task failed: " + e.getMessage());
        } finally {
            executor.shutdown();
            scheduler.shutdown();
        }
    }

    public static <T> CompletableFuture<T> runWithRetryAndTimeout(
            Supplier<T> task,
            int maxRetries,
            long timeout,
            int delayBetweenRetries,
            TimeUnit unit
    ) {
        return attempt(task, maxRetries, timeout, delayBetweenRetries, unit);
    }

    private static <T> CompletableFuture<T> attempt(
            Supplier<T> task,
            int retriesLeft,
            long timeout,
            int delayBetweenRetries,
            TimeUnit unit
    ) {
        return withTimeout(CompletableFuture.supplyAsync(task, executor), timeout, unit)
                .exceptionallyCompose(ex -> {
                    if (retriesLeft > 0) {
                        System.out.println("Retrying... attempts left: " + retriesLeft);
                        CompletableFuture<T> retryFuture = new CompletableFuture<>();
                        scheduler.schedule(() -> {
                            attempt(task, retriesLeft - 1, timeout, delayBetweenRetries, unit)
                                    .whenComplete((result, throwable) -> {
                                        if (throwable != null) retryFuture.completeExceptionally(throwable);
                                        else retryFuture.complete(result);
                                    });
                        }, delayBetweenRetries, unit);
                        return retryFuture;
                    } else {
                        return CompletableFuture.failedFuture(ex);
                    }
                });
    }

    private static <T> CompletableFuture<T> withTimeout(CompletableFuture<T> future, long timeout, TimeUnit unit) {
        CompletableFuture<T> timeoutFuture = new CompletableFuture<>();
        scheduler.schedule(() -> timeoutFuture.completeExceptionally(new TimeoutException("Timeout after " + timeout + " " + unit)),
                timeout, unit);
        return future.applyToEither(timeoutFuture, t -> t);
    }

    // Simulates a task that might randomly take too long
    private static String simulateTask(String input, int maxSecondsDelay) {
        int delay = ThreadLocalRandom.current().nextInt(1, maxSecondsDelay + 2);
        try {
            System.out.println("Simulating task with " + delay + " seconds delay...");
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return input + " (completed in " + delay + "s)";
    }
}
