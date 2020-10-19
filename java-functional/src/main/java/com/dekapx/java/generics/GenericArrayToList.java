package com.dekapx.java.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericArrayToList {
    public static void main(String[] args) {
        final Integer[] numbers = {10, 20, 30};
        print(arrayToList(numbers));

        final String[] languages = {"Java", "Scala", "Kotlin"};
        print(arrayToList(languages));
    }

    private static <T> List<T> arrayToList(final T[] elements) {
        return Arrays.stream(elements).collect(Collectors.toList());
    }

    private static <T> void print(final List<T> elements) {
        elements.forEach(e -> System.out.print(e + " "));
    }
}
