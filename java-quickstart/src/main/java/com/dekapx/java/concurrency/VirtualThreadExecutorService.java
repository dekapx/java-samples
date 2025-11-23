package com.dekapx.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExecutorService {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newVirtualThreadPerTaskExecutor();
        executors.submit(callable);
        executors.shutdown();
    }

    private static Callable<Void> callable = () -> {
        System.out.println("Executing thread...");
        return null;
    };
}
