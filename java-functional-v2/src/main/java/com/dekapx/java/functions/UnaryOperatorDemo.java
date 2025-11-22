package com.dekapx.java.functions;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    static void main() {
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        String result = toUpperCase.apply("hello world");
        System.out.println(result);
    }
}
