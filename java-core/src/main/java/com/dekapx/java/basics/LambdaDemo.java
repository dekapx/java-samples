package com.dekapx.java.basics;

@FunctionalInterface
interface HelloWorld {
    String sayHello(String arg);
}

public class LambdaDemo {
    private static void runnableLambda() {
        new Thread(() -> System.out.println("Running in a thread...")).start();
    }
}
