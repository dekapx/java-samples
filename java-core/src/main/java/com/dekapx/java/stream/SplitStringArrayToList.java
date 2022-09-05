package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitStringArrayToList {
    public static void main(String[] args) {
        final String[] tokens = {"Java", "Scala", "Python", "Kotlin", "Ruby"};
        final Stream<String> stream = Arrays.stream(tokens);



        final List<String> languages = stream
                .map(language -> language.split(","))
                .flatMap(Arrays::stream)
                .map(l -> l.toUpperCase())
                .collect(Collectors.toList());

        languages.forEach(System.out::println);
    }
}
