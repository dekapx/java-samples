package com.dekapx.java.basics;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class HelloWorld {
    public String sayHello(String arg) {
        if (isNull(arg)) {
            throw new IllegalArgumentException("Argument must not be null...");
        }
        return "Hello ! " + arg;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello("DeKapx"));
    }
}
