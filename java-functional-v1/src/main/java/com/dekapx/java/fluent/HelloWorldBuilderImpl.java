package com.dekapx.java.fluent;

public class HelloWorldBuilderImpl implements HelloWorldBuilder {
    private String arg;

    @Override
    public HelloWorldBuilder withArgument(String arg) {
        this.arg = arg;
        return this;
    }

    @Override
    public String sayHello() {
        return "Hello ! " + arg;
    }
}
