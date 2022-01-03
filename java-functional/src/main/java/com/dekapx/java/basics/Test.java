package com.dekapx.java.basics;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println("Hello");

        new Thread(runnable).start();
    }
}
