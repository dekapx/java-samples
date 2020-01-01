package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamSumReduceExample {
    public static void main(String[] args) {
        final int[] numbers = {1, 2, 3, 4, 5};
        final IntStream stream = Arrays.stream(numbers);
        int sum = stream.reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
