package com.dekapx.java.basics;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        sortNumbers();
        System.out.println("\n---------------------");
        sortStrings();
    }

    private static void sortStrings() {
        String[] languages = {"Java", "Scala", "Python", "Kotlin", "Haskell", "GoLang"};
        Arrays.stream(languages).sorted().forEach(System.out::println);
    }

    private static void sortNumbers() {
        int[] numbers = {8, 4, 2, 9, 6, 3, 1, 5, 7};
        Arrays.stream(numbers).sorted().forEach(System.out::print);
    }
}
