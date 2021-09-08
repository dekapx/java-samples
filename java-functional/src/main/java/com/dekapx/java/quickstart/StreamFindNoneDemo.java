package com.dekapx.java.quickstart;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.dekapx.java.util.StreamUtil.filterAnyMatch;
import static com.dekapx.java.util.StreamUtil.filterNoneMatch;

public class StreamFindNoneDemo {
    private static Predicate<String> predicate(final String element) {
        return s -> s.equals(element);
    }

    public static void main(String[] args) {

        final List<String> languages = Arrays.asList("Java", "Scala", "Kotlin");
        // return false, if not found, true otherwise
        System.out.println("anyMatch: " + filterAnyMatch(languages, predicate("Java")));
        System.out.println("anyMatch: " + filterAnyMatch(languages, predicate("Python")));

        // return true, if not found, false otherwise
        System.out.println("noneMatch: " + filterNoneMatch(languages, predicate("Java")));
        System.out.println("noneMatch: " + filterNoneMatch(languages, predicate("Python")));
    }
}
