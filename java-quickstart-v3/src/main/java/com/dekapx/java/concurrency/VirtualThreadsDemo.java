package com.dekapx.java.concurrency;

import java.util.stream.IntStream;

public class VirtualThreadsDemo {
    public static void main(String[] args) throws Exception {
        Thread virtualThread = Thread.startVirtualThread(() -> {
            IntStream.range(0, 5).forEach(i -> {
                System.out.println("Value: " + i);
            });
        });

        virtualThread.join();
        System.out.println("Thread processing completed");
    }
}
