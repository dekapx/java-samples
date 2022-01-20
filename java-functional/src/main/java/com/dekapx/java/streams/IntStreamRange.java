package com.dekapx.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * sajhdkjqhdsk
 */
public class IntStreamRange {
    public static void main(String[] args) {
        final int start = 1;
        final int end = 5;
        // iterate from 1 to 4
        List<Integer> numbers1 = IntStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers1);

        // iterate from 1 to 5
        List<Integer> numbers2 = IntStream.rangeClosed(start, end)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers2);
    }
}
