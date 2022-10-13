package com.dekapx.java.collections;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        immutableUsingCollections();
        immutableUsingGuava();
    }

    private static void immutableUsingCollections() {
        final List<String> numbers = List.of("One", "Two", "Three");
        print(numbers);
    }

    private static void immutableUsingGuava() {
        final List<String> numbers = ImmutableList.copyOf(Arrays.asList("One", "Two", "Three"));
        print(numbers);
    }

    private static void print(final List<String> numbers) {
        numbers.forEach(System.out::println);
    }
}
