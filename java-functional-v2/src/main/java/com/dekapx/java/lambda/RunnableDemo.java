package com.dekapx.java.lambda;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println("Hello Lambda");
        process(runnable);
    }

    private static void process(Runnable runnable) {
        new Thread(runnable).start();
    }
}
