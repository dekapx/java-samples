package com.dekapx.java.lambda;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class RunnableDemo {
    private static final Runnable runnable = RunnableDemo::run;

    private static Consumer<Integer> consumer = (count) -> {
        for (int i = 0; i < count; i++) {
            System.out.println(i + " ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        new Thread(runnable).start();
    }

    private static void run() {
        consumer.accept(5);
    }
}
