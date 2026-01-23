package com.dekapx.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentArrayElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 4, 4, 4);
        findMostFrequentElement1(numbers);
    }

    private static void findMostFrequentElement1(List<Integer> numbers) {
        int frequentElement = numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),    // use the number itself as the key
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .mapToInt(i -> i.getValue().intValue())
                .max().getAsInt();
        System.out.println("Most frequent element count: " + frequentElement);
    }

    private static void findMostFrequentElement2(List<Integer> numbers) {
        Optional<Map.Entry<Integer, Long>> mostFrequent = numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),    // use the number itself as the key
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        mostFrequent.ifPresent(mf ->
                System.out.println("Most frequent: " + mf.getKey() + " (count: " + mf.getValue() + ")"));
    }
}
