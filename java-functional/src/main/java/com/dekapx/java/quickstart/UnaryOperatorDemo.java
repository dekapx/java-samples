package com.dekapx.java.quickstart;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("hello"));
    }

    private static UnaryOperator<String> unaryOperator = (str) ->
            str.toUpperCase(Locale.ROOT);
}
