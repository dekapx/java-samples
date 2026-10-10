package com.dekapx.java.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {
    @Test
    public void givenArgument_shouldReturnExpectedResult() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello("World");
        assertThat(result)
                .isNotNull()
                .satisfies(o -> {
                    assertThat(o).isNotBlank();
                    assertThat(o).isEqualTo("Hello World");
                });

    }

    @ParameterizedTest(name = "PaymentService {0} to {1}")
    @CsvSource({
            "World, Hello World",
            "Java, Hello Java",
            "JUnit, Hello JUnit"
    })
    public void givenArguments_shouldReturnExpectedResults(String arg, String expected) {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello(arg);
        assertThat(result)
                .isNotNull()
                .satisfies(o -> {
                    assertThat(o).isNotBlank();
                    assertThat(o).isEqualTo(expected);
                });
    }
}
