package com.dekapx.java.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        System.out.println(sayHello.apply("Java"));
        System.out.println(squareRoot.apply(5));
    }

    private static UnaryOperator<String> sayHello = (arg) -> "Hello ! " + arg;

    private static UnaryOperator<Integer> squareRoot = (num) -> num * num;

}
