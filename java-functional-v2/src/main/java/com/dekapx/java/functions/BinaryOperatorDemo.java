package com.dekapx.java.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    static void main() {
        BinaryOperator<Integer> add = Integer::sum;
        Integer result = add.apply(5, 10);
        System.out.println(result);
    }
}
