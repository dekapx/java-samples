package com.dekapx.java.quickstart;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("hello", "world"));
    }

    private static BinaryOperator<String> binaryOperator = (s1, s2)
            -> s1.toUpperCase() + " " + s2.toUpperCase();
}
