package com.dekapx.java.algorithms;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        findMax();
    }

    private static void findMax() {
        List<Integer> numbers = Arrays.asList(2, 4, 10, 6, 8);
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(String.format("Max: %d", max));
    }

    private static void findMaxUsingStreams() {
        List<Integer> numbers = Arrays.asList(2, 4, 10, 6, 8);
        int max = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .max().getAsInt();
        System.out.println(String.format("Max: %d", max));
    }
}
