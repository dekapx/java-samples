package com.dekapx.java.util;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUtil {
    public static <T> List<T> filterCollectionByAndPredicates(final List<T> elements, final List<Predicate<T>> predicates) {
        return elements.stream()
                .filter(predicates.stream()
                        .reduce(e -> true, Predicate::and))
                .collect(Collectors.toList());
    }

    public static <T> List<T> filterCollectionByOrPredicates(final List<T> elements, final List<Predicate<T>> predicates) {
        return elements.stream()
                .filter(predicates.stream()
                        .reduce(e -> false, Predicate::or))
                .collect(Collectors.toList());
    }

    public static <T> boolean filterAnyMatch(final List<T> elements, final Predicate<T> predicate) {
        return elements.stream().anyMatch(predicate);
    }

    public static <T> boolean filterNoneMatch(final List<T> elements, final Predicate<T> predicate) {
        return elements.stream().noneMatch(predicate);
    }
}
