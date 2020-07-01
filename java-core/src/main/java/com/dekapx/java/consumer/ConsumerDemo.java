package com.dekapx.java.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        final List<String> languages = Arrays.asList("Java", "Scala", "Kotlin");
        languages.forEach(print);
    }

    private static Consumer<String> print = (arg) -> {
        System.out.println(arg);
    };
}
