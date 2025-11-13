package com.dekapx.java.basics;

import com.dekapx.java.basics.lambdas.HelloWorld;

public class Test {
    static void main(String[] args) {
        HelloWorld helloWorld = helloWorldBuilder();
        helloWorldExecutor(helloWorld, "World");
    }

    private static HelloWorld helloWorldBuilder() {
        return name -> "Hello, " + name + "!";
    }

    private static void helloWorldExecutor(HelloWorld helloWorld, String name) {
        String message = helloWorld.sayHello(name);
        System.out.println(message);
    }
}
