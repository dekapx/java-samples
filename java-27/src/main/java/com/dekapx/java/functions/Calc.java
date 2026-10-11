package com.dekapx.java.functions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Calc {
    public BiFunction<Integer, Integer, Integer> add
            = (a, b) -> a + b;

    public BiFunction<Integer, Integer, Integer> subtract
            = (a, b) -> a - b;

    public BinaryOperator<Integer> multiply
            = (a, b) -> a * b;

    public BinaryOperator<Integer> divide
            = (a, b) -> a / b;
}
