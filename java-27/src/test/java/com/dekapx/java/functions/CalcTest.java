package com.dekapx.java.functions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    private Calc calc;

    @BeforeEach
    public void setUp() {
        this.calc = new Calc();
    }

    @ParameterizedTest(name = "Add {0} and {1} should return {2}")
    @CsvSource({
            "10, 5, 15",
            "20, 10, 30"
    })
    public void givenTwoNumbers_whenAdd_thenReturnSum(int a, int b, int expected) {
        int result = this.calc.add.apply(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Subtract {0} and {1} should return {2}")
    @CsvSource({
            "10, 5, 5",
            "20, 10, 10"
    })
    public void givenTwoNumbers_whenSubtract_thenReturnDifference(int a, int b, int expected) {
        int result = this.calc.subtract.apply(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Multiply {0} and {1} should return {2}")
    @CsvSource({
            "10, 5, 50",
            "20, 10, 200"
    })
    public void givenTwoNumbers_whenMultiply_thenReturnProduct(int a, int b, int expected) {
        int result = this.calc.multiply.apply(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Divide {0} and {1} should return {2}")
    @CsvSource({
            "10, 5, 2",
            "20, 10, 2"
    })
    public void givenTwoNumbers_whenDivide_thenReturnQuotient(int a, int b, int expected) {
        int result = this.calc.divide.apply(a, b);
        assertThat(result).isEqualTo(expected);
    }
}
