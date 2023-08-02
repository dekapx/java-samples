package com.dekapx.java.fluent;

public interface HelloWorldBuilder {
    static HelloWorldBuilder builder() {
        return new HelloWorldBuilderImpl();
    }

    HelloWorldBuilder withArgument(String arg);

    String sayHello();
}
