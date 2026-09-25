package com.dekapx.java.fluent.api.calc;

import com.dekapx.java.model.MathOperation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorImplTest {

    @Test
    void shouldReturnSumForAddition() {
        Calculator calculator = new CalculatorImpl()
                .operand1(10)
                .operand2(5)
                .operation(MathOperation.ADDITION);
        assertThat(calculator.calculate()).isEqualTo(15);
    }

    @Test
    void shouldReturnDifferenceForSubtraction() {
        Calculator calculator = new CalculatorImpl()
                .operand1(10)
                .operand2(5)
                .operation(MathOperation.SUBTRACTION);
        assertThat(calculator.calculate()).isEqualTo(5);
    }

    @Test
    void shouldReturnProductForMultiplication() {
        Calculator calculator = new CalculatorImpl()
                .operand1(10)
                .operand2(5)
                .operation(MathOperation.MULTIPLICATION);
        assertThat(calculator.calculate()).isEqualTo(50);
    }

    @Test
    void shouldReturnQuotientForDivision() {
        Calculator calculator = new CalculatorImpl()
                .operand1(10)
                .operand2(5)
                .operation(MathOperation.DIVISION);
        assertThat(calculator.calculate()).isEqualTo(2);
    }
}
