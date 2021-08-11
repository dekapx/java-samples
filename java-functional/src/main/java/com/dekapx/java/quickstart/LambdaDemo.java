package com.dekapx.java.quickstart;

public class LambdaDemo {
    public static void main(String[] args) {
        final HelloWorld helloWorld = (arg) -> "Hello ! " + arg;
        execute(helloWorld);
    }

    private static void execute(HelloWorld helloWorld) {
        System.out.printf(helloWorld.sayHello("Test"));
    }
}
