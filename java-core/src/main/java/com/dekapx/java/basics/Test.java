package com.dekapx.java.basics;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            IntStream.range(0, 5).forEach(i -> System.out.println(i));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnable).start();
    }

    private static void runnableExampleOne() {
        Runnable runnable = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                IntStream.range(0, 5).forEach(i -> System.out.println(i));
                TimeUnit.SECONDS.sleep(1);
            }
        };

        new Thread(runnable).start();
    }
}
