package com.dekapx.java.concurrency;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CompletableFutureAsyncDemo {
    public static void main(String[] args) {
        CompletableFutureAsyncDemo demo = new CompletableFutureAsyncDemo();
        CompletableFuture<Void> future = demo.buildCompletableFuture();
        demo.executeCompletableFuture(future);
    }

    private CompletableFuture<Void> buildCompletableFuture() {
        return CompletableFuture.runAsync(() -> {
            performTaskWithDelays();
        }).orTimeout(5, TimeUnit.SECONDS).whenComplete((input, exception) -> {
            if (Objects.nonNull(exception)) {
                System.out.println("Service not available...");
            }
        });
    }

    private void executeCompletableFuture(CompletableFuture<Void> future) {
        try {
            future.get();
        } catch (Exception e) {
            System.out.println("Exception...");
        }
    }

    private void performTaskWithDelays() {
        IntStream.rangeClosed(1, 5)
                .forEach(i -> {
                    try {
                        System.out.println("Running: "+ i);
                        TimeUnit.SECONDS.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
