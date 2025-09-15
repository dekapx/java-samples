package com.dekapx.java.algorithms;

import java.util.Arrays;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        findSum();
    }

    private static void findSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(String.format("Sum: %d", sum));
    }

    private static void findSumUsingStreams() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(String.format("Sum: %d", sum));
    }
}
