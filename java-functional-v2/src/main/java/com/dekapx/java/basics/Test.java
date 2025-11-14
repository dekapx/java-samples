package com.dekapx.java.basics;

import com.dekapx.java.lambdas.HelloWorld;

public class Test {
    static void main(String[] args) {
        HelloWorld helloWorld = prepare();
        execute(helloWorld, "World");
    }

    private static HelloWorld prepare() {
        return name -> "Hello, " + name + "!";
    }

    private static void execute(HelloWorld helloWorld, String name) {
        String message = helloWorld.sayHello(name);
        System.out.println(message);
    }
}
