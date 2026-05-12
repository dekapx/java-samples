package com.dekapx.java.utils;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamUtilsTest {
    @Test
    public void shouldFilterColectionBySinglePredicate() {
        List<String> source = List.of("Java", "Scala", "Python", "Kotlin", "JavaScript");
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        List<Predicate<String>> predicates = List.of(startsWithJ);

        List<String> result = StreamUtils.filterByPredicates(source, predicates);
        assertThat(result)
                .isNotEmpty()
                .hasSize(2)
                .containsExactly("Java", "JavaScript");
    }

    @Test
    public void shouldFilterColectionByMultiplePredicates() {
        List<String> source = List.of("Java", "Scala", "Python", "Kotlin", "JavaScript");
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        Predicate<String> lengthGreaterThan4 = s -> s.length() > 4;

        List<Predicate<String>> predicates = List.of(startsWithJ,  lengthGreaterThan4);

        List<String> result = StreamUtils.filterByPredicates(source, predicates);
        assertThat(result)
                .isNotEmpty()
                .hasSize(1)
                .containsExactly("JavaScript");
    }
}
