package com.dekapx.java.utils;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class StreamUtils {
    public static <T> List<T> filterByPredicates(List<T> source, List<Predicate<T>> predicates) {
        if (source == null || source.isEmpty()) {
            return List.of();
        }

        if (predicates == null || predicates.isEmpty()) {
            return source;
        }

        Predicate<T> combinedPredicate = predicates
                .stream()
                .filter(Objects::nonNull)
                .reduce(x -> true, Predicate::and);
        return source
                .stream()
                .filter(combinedPredicate)
                .toList();
    }
}
