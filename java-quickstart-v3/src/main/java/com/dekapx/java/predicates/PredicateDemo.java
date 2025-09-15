package com.dekapx.java.predicates;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    private static Predicate<String> checkNotNull = (name)
            -> Objects.nonNull(name);

    public static void main(String[] args) {
        List<String> validNames = getNames()
                .stream()
                .filter(checkNotNull)
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        validNames.forEach(System.out::println);
    }

    private static List<String> getNames() {
        return Arrays.asList("Tom", "Jerry", null, "Dora", null, "ShinChan");
    }

}
