package com.dekapx.java.basics;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CollectionOptionalNullCheck {
    public static void main(String[] args) {
        final List<String> list = List.of("Java", "Scala", "Kotlin", "GOLang");
        System.out.println(getFirstElement(Collections.emptyList()));
    }

    private static String getFirstElement(final List<String> list) {
        return Optional.ofNullable(list)
                .filter(o -> (!o.isEmpty()))
                .map(o -> o.get(0))
                .orElseThrow(() -> new IllegalArgumentException("Collection must not be null"));
    }
}
