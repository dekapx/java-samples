package com.dekapx.java.fluent.api.calc;

import com.dekapx.java.model.MathOperation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorImplTest {

    @Test
    void shouldReturnSumForAddition() {
        assertThat(calculate(7, 5, MathOperation.ADDITION)).isEqualTo(12);
    }

    @Test
    void shouldReturnDifferenceForSubtraction() {
        assertThat(calculate(7, 5, MathOperation.SUBTRACTION)).isEqualTo(2);
    }

    @Test
    void shouldReturnProductForMultiplication() {
        assertThat(calculate(7, 5, MathOperation.MULTIPLICATION)).isEqualTo(35);
    }

    @Test
    void shouldReturnQuotientForDivision() {
        assertThat(calculate(10, 2, MathOperation.DIVISION)).isEqualTo(5);
    }

    @Test
    void shouldSupportFluentConfiguration() {
        Calculator calculator = new CalculatorImpl();

        assertThat(calculator.operand1(10))
                .isSameAs(calculator);
        assertThat(calculator.operand2(2))
                .isSameAs(calculator);
        assertThat(calculator.operation(MathOperation.DIVISION))
                .isSameAs(calculator);
    }

    @Test
    void shouldBuildCalculatorWithBuilder() {
        Calculator calculator = CalculatorImpl.builder()
                .operand1(10)
                .operand2(2)
                .operation(MathOperation.DIVISION)
                .build();

        assertThat(calculator.calculate()).isEqualTo(5);
    }

    private int calculate(int operand1, int operand2, MathOperation operation) {
        return new CalculatorImpl()
                .operand1(operand1)
                .operand2(operand2)
                .operation(operation)
                .calculate();
    }
}
