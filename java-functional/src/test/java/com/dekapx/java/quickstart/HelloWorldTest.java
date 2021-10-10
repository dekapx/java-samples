package com.dekapx.java.quickstart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HelloWorldTest {
    private HelloWorld helloWorld;

    @BeforeEach
    public void setup() {
        helloWorld = new HelloWorld();
    }

    @Test
    @Order(1)
    @DisplayName("Verify Correct Output")
    public void givenArgShouldReturnCorrectValue() {
        String actual = helloWorld.sayHello("DeKapx");
        assertThat(actual).isNotNull().isEqualTo("Hello ! DeKapx");
    }

    @Test
    @Order(2)
    @DisplayName("Verify Throws Exception")
    public void givenArgShouldThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            helloWorld.sayHello(null);
        });
        String expectedMessage = "Argument must not be null...";
        String actualMessage = exception.getMessage();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }
}
