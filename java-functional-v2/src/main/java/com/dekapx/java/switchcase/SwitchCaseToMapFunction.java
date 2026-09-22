package com.dekapx.java.switchcase;

import com.dekapx.java.model.MathOperation;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import static com.dekapx.java.model.MathOperation.ADDITION;
import static com.dekapx.java.model.MathOperation.DIVISION;
import static com.dekapx.java.model.MathOperation.MULTIPLICATION;
import static com.dekapx.java.model.MathOperation.SUBTRACTION;

public class SwitchCaseToMapFunction {
    private static BiFunction<Integer, Integer, Integer> addition
            = (a, b) -> a + b;

    private static BiFunction<Integer, Integer, Integer> subtraction
            = (a, b) -> a - b;

    private static BinaryOperator<Integer> multiplication
            = (a, b) -> a * b;

    private static BinaryOperator<Integer> division
            = (a, b) -> a / b;

    private static Map<MathOperation, BiFunction<Integer, Integer, Integer>> mathOperationMap = Map.of(
            ADDITION, addition,
            SUBTRACTION, subtraction,
            MULTIPLICATION, multiplication,
            DIVISION, division
    );

    static void main() {
        System.out.println("ADDITION: " + mathOperationMap.get(ADDITION).apply(5, 3));
        System.out.println("SUBTRACTION: " + mathOperationMap.get(SUBTRACTION).apply(5, 3));
        System.out.println("MULTIPLICATION: " + mathOperationMap.get(MULTIPLICATION).apply(5, 3));
        System.out.println("DIVISION: " + mathOperationMap.get(DIVISION).apply(5, 3));
    }
}
