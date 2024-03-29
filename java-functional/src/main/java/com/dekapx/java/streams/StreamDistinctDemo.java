package com.dekapx.java.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDistinctDemo {
    private static Predicate<Integer> numberPredicate(final Integer value) {
        return i -> i <= value;
    }
    public static void main(String[] args) {
        withFilter(buildRange.get());
        System.out.println("");
        withTakeWhile(buildRange.get());
        System.out.println("");
        withDropWhile(buildRange.get());
    }

    private static void withFilter(List<Integer> numbers) {
        numbers.stream().filter(numberPredicate(3)).forEach(print);
    }
    // takeWhile & dropWhile won't process whole stream until condition matches
    private static void withTakeWhile(List<Integer> numbers) {
        numbers.stream().takeWhile(numberPredicate(3)).forEach(print);
    }

    private static void withDropWhile(List<Integer> numbers) {
        numbers.stream().dropWhile(numberPredicate(6)).forEach(print);
    }

    private static Supplier<List<Integer>> buildRange = () ->
            IntStream.range(1, 10).boxed().collect(Collectors.toList());

    private static Consumer<Integer> print = (num) ->
            System.out.print(num + " ");
}
