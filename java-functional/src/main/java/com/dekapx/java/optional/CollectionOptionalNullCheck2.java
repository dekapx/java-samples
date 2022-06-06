package com.dekapx.java.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CollectionOptionalNullCheck2 {
    public static void main(String[] args) {
        final List<String> elements = getElements();
    }

    private static String getFirstElement(final List<String> list) {
        return Optional.ofNullable(list)
                .filter(o -> (!o.isEmpty()))
                .map(o -> o.get(0))
                .orElseThrow(() -> new IllegalArgumentException("Collection must not be null"));
    }

    private static List<String> getElements() {
        return Collections.emptyList();
//        return List.of("Java", "Scala", "Kotlin", "GOLang");
    }
}
