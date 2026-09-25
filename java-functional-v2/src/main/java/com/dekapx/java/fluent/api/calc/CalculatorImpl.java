package com.dekapx.java.fluent.api.calc;

import com.dekapx.java.model.MathOperation;

import java.util.Map;
import java.util.function.BiFunction;

import static com.dekapx.java.model.MathOperation.ADDITION;
import static com.dekapx.java.model.MathOperation.DIVISION;
import static com.dekapx.java.model.MathOperation.MULTIPLICATION;
import static com.dekapx.java.model.MathOperation.SUBTRACTION;

public class CalculatorImpl implements Calculator {
    private int operand1;
    private int operand2;
    private MathOperation operation;

    private final Map<MathOperation, BiFunction<Integer, Integer, Integer>> MATH_OPERATIONS = Map.of(
            ADDITION, new Addition(),
            SUBTRACTION, new Subtraction(),
            MULTIPLICATION, new Multiplication(),
            DIVISION, new Division()
    );

    @Override
    public CalculatorImpl operand1(int operand1) {
        this.operand1 = operand1;
        return this;
    }

    @Override
    public CalculatorImpl operand2(int operand2) {
        this.operand2 = operand2;
        return this;
    }

    @Override
    public CalculatorImpl operation(MathOperation operation) {
        this.operation = operation;
        return this;
    }

    @Override
    public int calculate() {
        return MATH_OPERATIONS.get(operation).apply(operand1, operand2);
    }
}
