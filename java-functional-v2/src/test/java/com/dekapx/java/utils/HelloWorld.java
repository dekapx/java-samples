package com.dekapx.java.utils;

public class HelloWorld {
    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String sayHello() {
        return "Hello World!";
    }

    public String sayHelloWithMessage() {
        return "Hello World! " + message;
    }
}
