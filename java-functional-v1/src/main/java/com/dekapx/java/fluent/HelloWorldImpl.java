package com.dekapx.java.fluent;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String arg) {
        return "Hello ! " + arg;
    }
}
