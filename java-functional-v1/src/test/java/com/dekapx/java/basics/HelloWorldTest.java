package com.dekapx.java.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class HelloWorldTest {
    @InjectMocks
    private HelloWorld helloWorld;

    @Test
    public void sayHello_withCorrectInput_shouldReturnCorrectValue() {
        final String result = this.helloWorld.sayHello("Test");
        assertThat(result).isNotNull()
                .satisfies(o -> {
                    assertThat(o).isEqualTo("Hello ! Test");
                });
    }

    @Test
    public void sayHello_shouldThrowException_whenNullOrEmptyInput() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.helloWorld.sayHello(null);
        });
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
    }
}
