package com.dekapx.java.quickstart;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.nonNull;

public class HelloWorld {
    public String sayHello(String arg) {
        checkArgument(nonNull(arg), "Argument must not be null...");
        return "Hello ! " + arg;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello("DeKapx"));
    }
}
