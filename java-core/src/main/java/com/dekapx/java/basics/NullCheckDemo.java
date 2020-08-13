package com.dekapx.java.basics;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public class NullCheckDemo {
    public static void main(String[] args) {
        System.out.println(new NullCheckDemo().sayHello("DeKapx"));
        System.out.println(new NullCheckDemo().sayHello(null));
    }

    public String sayHello(final String arg) {
        requireNonNull(arg, nonNullSupplier);
        return "Hello ! " + arg;
    }

    private Supplier<String> nonNullSupplier = () -> {
        throw new IllegalArgumentException("Argument must not be null or empty...");
    };
}
