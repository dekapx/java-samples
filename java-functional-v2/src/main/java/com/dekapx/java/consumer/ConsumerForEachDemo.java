package com.dekapx.java.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerForEachDemo {
    public static void main(String[] args) {
        List<String> languages = List.of("Java", "Scala", "Kotlin", "Python", "GoLang");
        languages.forEach(print);
    }

    private static Consumer<String> print = (language) ->
            System.out.println("[ " + language + " ]");
}
