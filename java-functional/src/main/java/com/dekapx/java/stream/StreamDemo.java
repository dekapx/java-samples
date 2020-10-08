package com.dekapx.java.stream;

import java.util.List;
import java.util.function.Supplier;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = languageSupplier.get();
        strings.forEach(s -> System.out.println(s));
    }

    private static Supplier<List<String>> languageSupplier = () ->
            List.of("Java", "Scala", "Kotlin");

}
