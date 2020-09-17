package com.dekapx.java.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        final List<String> languages = Arrays.asList("Java", "Scala", "Kotlin");
        languages.forEach(print);

        final Optional<String> optional = Optional.ofNullable("Test");
        optional.ifPresent(printConsumer);
    }

    private static Consumer<String> print = (arg) -> {
        System.out.println(arg);
    };

    private static Consumer<String> printConsumer = (str) -> {
        System.out.println(str);
    };
}
