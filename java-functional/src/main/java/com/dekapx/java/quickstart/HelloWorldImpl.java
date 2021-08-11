package com.dekapx.java.quickstart;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String arg) {
        return "Hello ! " + arg;
    }
}
