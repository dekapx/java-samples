package com.dekapx.java.basics;

@FunctionalInterface
interface Greeting {
    void sayHello(String arg);
}

public class Test {
    public static void main(String[] args) {
        Greeting greeting = (arg) -> {
            System.out.println("Hello ! " + arg);
        };

        Greeting greeting2 = (arg) -> {
            for (int i = 0; i < 5; i ++) {
                System.out.println("Hello ! " + arg);
            }
        };

        useLambda(greeting2, "Sumit");
    }

    private static void useLambda(Greeting greeting, String name) {
        greeting.sayHello(name);
    }
}
