package com.dekapx.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        final List<String> languages = new ArrayList<>();
        final String[] tokens = {"Java", "Scala", "Python"};
        Arrays.stream(tokens).forEach(token -> biConsumer.accept(languages, token));

        languages.forEach(System.out::println);
    }

    final static BiConsumer<List<String>, String> biConsumer = (languages, token) -> {
        languages.add(token);
    };
}
