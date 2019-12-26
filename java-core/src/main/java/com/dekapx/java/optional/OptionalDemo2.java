package com.dekapx.java.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo2 {
    private static final Optional<String> noValue = Optional.empty();

    public static void main(String[] args) {
        verify1(Optional.empty());
        verify2(Optional.of("Test"));
        verify3(Optional.of("Test"));
        verify4(Optional.empty());
    }

    private static void verify1(final Optional<String> optional) {
        if (noValue.equals(optional)) {
            System.out.println("Value not present...");
        }
    }

    // optional.isPresent() return boolean if value present
    private static void verify2(final Optional<String> optional) {
        if (optional.isPresent()) {
            System.out.println("Value present = " + optional.get());
        }
    }

    // optional.ifPresent accept consumer and doesn't return anything...
    private static void verify3(final Optional<String> optional) {
        optional.ifPresent(p -> consumer.accept(p));
    }

    private static Consumer<String> consumer = (s) -> System.out.println(s);

    private static void verify4(final Optional<String> optional) {
        System.out.println(optional.orElse("Default Value..."));
    }
}
