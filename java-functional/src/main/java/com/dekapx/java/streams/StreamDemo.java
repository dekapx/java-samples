package com.dekapx.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        final List<String> elements = List.of("Java", "Scala", "Kotlin", "GOLang");
        String tokens = elements
                .stream()
                .peek(e -> System.out.println(e))
                .collect(Collectors.joining(", "));
        System.out.println(tokens);
    }
}
