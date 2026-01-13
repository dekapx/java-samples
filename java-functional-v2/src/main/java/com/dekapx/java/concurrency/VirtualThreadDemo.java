package com.dekapx.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadDemo {
    static void main() {
        Callable<Void> task = () -> {
            System.out.println("Virtual Thread: " + Thread.currentThread().getName());
            return null;
        };

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 5).forEach(i -> {
                executor.submit(task);
            });
        }
    }
}
