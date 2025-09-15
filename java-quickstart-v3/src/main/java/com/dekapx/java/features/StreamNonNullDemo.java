package com.dekapx.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamNonNullDemo {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", null, "Kotlin", null, "Python");
//        filterNullElementsSolution1(languages);
        filterNullElementsSolution2(languages);
    }

    private static void filterNullElementsSolution1(List<String> languages) {
        languages
                .stream()
                .flatMap(Stream::ofNullable)
                .forEach(System.out::println);
    }

    private static void filterNullElementsSolution2(List<String> languages) {
        languages
                .stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
