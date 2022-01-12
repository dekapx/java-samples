package com.dekapx.java.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java"));
    }

    private static UnaryOperator<String> unaryOperator = (arg) -> "Hello ! " + arg;
}
