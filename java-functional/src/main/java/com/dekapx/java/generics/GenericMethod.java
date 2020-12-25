package com.dekapx.java.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericMethod {
    public static <T> List<T> arrayToList(final T[] elements) {
        return Arrays.stream(elements).collect(Collectors.toList());
    }

    public static <T> void print(final List<T> elements) {
        elements.forEach(e -> System.out.print(e + " "));
    }
}
