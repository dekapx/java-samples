package com.dekapx.java.fluent.api.calc;

import java.util.function.BinaryOperator;

public class Subtraction implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a - b;
    }
}
