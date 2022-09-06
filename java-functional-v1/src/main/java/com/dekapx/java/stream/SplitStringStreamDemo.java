package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringStreamDemo {
    public static void main(String[] args) {
        final String tokens = "Java, Scala, Java, Python, Kotlin, Ruby, Python, Scala";

        List<String> languages = Arrays.stream(tokens.split(","))
                .map(o -> o.trim())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        languages.forEach(System.out::println);
    }
}
