package com.dekapx.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ComputeIfDemo {
    public static void main(String[] args) {
        final Map<String, String> elements = new HashMap<>();
        elements.put("Model", "BMW");
        elements.put("Color", "Imperial Blue");
        elements.put("Year", "2016");
        displayElements(elements);
    }

    private static void displayElements(final Map<String, String> elements) {
        elements.entrySet().forEach(print);
        elements.computeIfPresent("Color", (key, value) -> "Carbon Black");
        elements.entrySet().forEach(print);
    }

    private static Consumer<Map.Entry> print = (entry) -> {
        System.out.print("[ " + entry.getKey() + ": " + entry.getValue() + "]");
    };
}
