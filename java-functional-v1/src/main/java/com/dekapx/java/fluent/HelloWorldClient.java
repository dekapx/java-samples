package com.dekapx.java.fluent;

public class HelloWorldClient {
    public static void main(String[] args) {
        HelloWorldBuilder helloWorldBuilder = new HelloWorldBuilderImpl();
        helloWorldBuilder.withArgument("Java")
                .printHello();
    }
}
