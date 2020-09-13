package com.dekapx.java.basics;

import com.dekapx.java.model.Language;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNewObject {
    public static void main(String[] args) {
        String[] array = {"Java", "Scala", "Python", "Kotlin", "Haskell", "GoLang"};
        List<Language> languages = Arrays.stream(array).map(Language::new)
                .collect(Collectors.toList());
        languages.stream()
                .map(Language::getName)
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
