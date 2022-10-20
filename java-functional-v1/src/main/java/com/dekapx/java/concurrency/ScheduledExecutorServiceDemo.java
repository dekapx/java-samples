package com.dekapx.java.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    private static ScheduledExecutorService executor = Executors.newScheduledThreadPool ( 1 );

    public static void main(String[] args) {
        try {
            executor.scheduleAtFixedRate (runnable, 0L , 5L , TimeUnit.SECONDS );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Runnable runnable = () -> System.out.println("Hello World");
}
