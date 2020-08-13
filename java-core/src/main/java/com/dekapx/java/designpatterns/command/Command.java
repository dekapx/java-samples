package com.dekapx.java.designpatterns.command;

@FunctionalInterface
public interface Command<T> {
    void execute(T request);
}
