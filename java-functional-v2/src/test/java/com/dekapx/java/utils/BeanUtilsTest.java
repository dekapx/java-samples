package com.dekapx.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static com.dekapx.java.utils.BeanUtils.createInstance;

public class BeanUtilsTest {
    @Test
    public void createInstanceWithoutArgs() {
        HelloWorld helloWorld = createInstance(HelloWorld.class);
        assertThat(helloWorld)
                .isNotNull()
                .satisfies(o -> {
                    assertThat(o.sayHello()).isEqualTo("Hello World!");
                });
    }

    @Test
    public void createInstanceWithArgs() {
        HelloWorld helloWorld = BeanUtils.createInstance(HelloWorld.class, "Hello from BeanUtils!");
        assertThat(helloWorld)
                .isNotNull()
                .satisfies(o -> {
                    assertThat(o.sayHelloWithMessage()).isEqualTo("Hello World! Hello from BeanUtils!");
                });
    }
}
