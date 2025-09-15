package com.dekapx.java.basics;


interface HelloWorld {
    String sayHello(String arg);

    default String sayGoodbye(String arg) {
        return "Goodbye " + arg;
    }

    static String sayWelcome(String arg) {
        return "Welcome " + arg;
    }
}
public class Test {
    public static void main(String[] args) {
        HelloWorld helloWorld = (arg) -> "Hello " + arg;
        System.out.println(helloWorld.sayHello("World"));
        System.out.println(helloWorld.sayGoodbye("World"));
        System.out.println(HelloWorld.sayWelcome("World"));
    }
}
