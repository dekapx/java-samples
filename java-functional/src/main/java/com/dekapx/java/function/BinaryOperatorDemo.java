package com.dekapx.java.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        System.out.println(sum.apply(5, 7));
    }

    private static BinaryOperator<Integer> sum = (num1, num2) ->
            num1 + num2;
}
