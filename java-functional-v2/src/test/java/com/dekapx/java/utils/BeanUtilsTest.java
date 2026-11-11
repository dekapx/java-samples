package com.dekapx.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BeanUtilsTest {
    @Test
    public void createInstanceWithoutArgs() {
        HelloWorld helloWorld = BeanUtils.createInstance(HelloWorld.class);
        assertThat(helloWorld).isNotNull();
        assertThat(helloWorld.sayHello()).isEqualTo("Hello World!");
    }

    @Test
    public void createInstanceWithArgs() {
        HelloWorld helloWorld = BeanUtils.createInstanceWithArgs(HelloWorld.class, "Hello from BeanUtils!");
        assertThat(helloWorld).isNotNull();
        assertThat(helloWorld.sayHelloWithMessage()).isEqualTo("Hello World! Hello from BeanUtils!");
    }
}
