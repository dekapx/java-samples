package com.dekapx.java.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "Kotlin", "Python", "Golang");
        languages.forEach(l -> print.accept(l));

        System.out.println();

        languages.sort(Comparator.naturalOrder());
        languages.forEach(print);

        System.out.println();

        languages.sort(Comparator.reverseOrder());
        languages.forEach(print);
    }

    static Consumer<String> print = (l) -> {
        System.out.print(l + " ");
    };
}
