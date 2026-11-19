package com.dekapx.java.fluent.api.calc;

import com.dekapx.java.model.MathOperation;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;

import static com.dekapx.java.model.MathOperation.ADDITION;
import static com.dekapx.java.model.MathOperation.DIVISION;
import static com.dekapx.java.model.MathOperation.MULTIPLICATION;
import static com.dekapx.java.model.MathOperation.SUBTRACTION;

public class CalculatorImpl implements Calculator {
    private final int operand1;
    private final int operand2;
    private final MathOperation operation;

    private final Map<MathOperation, BiFunction<Integer, Integer, Integer>> MATH_OPERATIONS = Map.of(
            ADDITION, new Addition(),
            SUBTRACTION, new Subtraction(),
            MULTIPLICATION, new Multiplication(),
            DIVISION, new Division()
    );

    private CalculatorImpl(int operand1, int operand2, MathOperation operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public static Calculator create() {
        return new CalculatorImpl(0, 0, null);
    }

    @Override
    public CalculatorImpl operand1(int operand1) {
        return new CalculatorImpl(operand1, this.operand2, this.operation);
    }

    @Override
    public CalculatorImpl operand2(int operand2) {
        return new CalculatorImpl(this.operand1, operand2, this.operation);
    }

    @Override
    public CalculatorImpl operation(MathOperation operation) {
        return new CalculatorImpl(this.operand1, this.operand2, operation);
    }

    @Override
    public int calculate() {
        Optional.ofNullable(this.operation)
                .orElseThrow(() -> new IllegalArgumentException("Operation is required."));
        Optional.ofNullable(this.operand1)
                .orElseThrow(() -> new IllegalArgumentException("Operand is required."));
        Optional.ofNullable(this.operand2)
                .orElseThrow(() -> new IllegalArgumentException("Operand is required."));
        return MATH_OPERATIONS.get(operation).apply(operand1, operand2);
    }
}
