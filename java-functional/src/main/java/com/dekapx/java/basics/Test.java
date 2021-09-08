package com.dekapx.java.basics;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        final List<String> languages = Arrays.asList("Java", "Scala", "Kotlin");
        boolean match = exists(languages, "Java");
        System.out.println(match);
    }

    private static boolean exists(List<String> languages, String arg) {
        return languages.stream().noneMatch(l -> l.equals(arg));
    }
}
