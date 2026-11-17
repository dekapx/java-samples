package com.dekapx.java.fluent.api.calc;

import com.dekapx.java.model.MathOperation;

public interface Calculator {
    static Calculator create() {
        return new CalculatorImpl();
    }
    Calculator operand1(int operand1);
    Calculator operand2(int operand2);
    Calculator operation(MathOperation operation);
    int calculate();
}
