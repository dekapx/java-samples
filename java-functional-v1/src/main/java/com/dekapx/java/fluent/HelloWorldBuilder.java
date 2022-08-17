package com.dekapx.java.fluent;

public interface HelloWorldBuilder {
    HelloWorldBuilder withArgument(String arg);

    void printHello();
}
