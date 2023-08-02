package com.dekapx.java.fluent;

public class HelloWorldClient {
    public static void main(String[] args) {
        String output = HelloWorldBuilder.builder()
                .withArgument("Java")
                .sayHello();
        System.out.println(output);
    }
}
