package com.dekapx.java.basics;

public class LambdaDemo {
    public static void main(String[] args) {
        final Runnable runnable = ()
                -> System.out.println(Thread.currentThread().getName());
        new Thread(runnable).start();
    }
}
