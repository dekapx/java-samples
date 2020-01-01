package com.dekapx.java.stream;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamListToMapDemo {
    public static void main(String[] args) {
        final List<String> languages = List.of("Java", "Scala", "Python", "Kotlin", "Ruby");
        toMapExampleOne(languages);
        toMapExampleTwo(languages);
    }

    private static void toMapExampleOne(final List<String> languages) {
        final Map<String, Integer> elements = languages.stream()
                .collect(Collectors.toMap(l -> l.toUpperCase(), l -> l.length()));
        printElements(elements);
    }

    private static void toMapExampleTwo(final List<String> languages) {
        final Map<String, Integer> elements = languages.stream()
                .sorted()
                .map(l -> new AbstractMap.SimpleImmutableEntry<>(l.toUpperCase(), l.length()))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        printElements(elements);
    }

    private static void printElements(final Map<String, Integer> elements) {
        System.out.println("\n-------------------------------------------------------------------");
        elements.entrySet().forEach(e -> consumer.accept(e));
    }

    private static Consumer<Map.Entry> consumer = (entry) -> {
        System.out.print("\t" + entry.getKey() + " {" + entry.getValue() + "}");
    };
}
