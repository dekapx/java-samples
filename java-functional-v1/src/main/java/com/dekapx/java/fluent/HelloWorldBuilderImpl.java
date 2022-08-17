package com.dekapx.java.fluent;

public class HelloWorldBuilderImpl implements HelloWorldBuilder {
    private String arg;

    @Override
    public HelloWorldBuilder withArgument(String arg) {
        this.arg = arg;
        return this;
    }

    @Override
    public void printHello() {
        HelloWorld helloWorld = new HelloWorldImpl();
        System.out.println(helloWorld.sayHello(this.arg));
    }
}
