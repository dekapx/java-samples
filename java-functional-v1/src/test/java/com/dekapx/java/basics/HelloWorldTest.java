package com.dekapx.java.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HelloWorldTest {
    @InjectMocks
    private HelloWorld helloWorld;

    @Test @Order(1)
    public void sayHello_withCorrectInput_shouldReturnCorrectValue() {
        final String result = this.helloWorld.sayHello("Test");
        assertThat(result).isNotNull()
                .satisfies(o -> {
                    assertThat(o).isEqualTo("Hello ! Test");
                });
    }

    @Test @Order(2)
    public void sayHello_shouldThrowException_whenNullOrEmptyInput() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.helloWorld.sayHello(null);
        });
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
    }
}
