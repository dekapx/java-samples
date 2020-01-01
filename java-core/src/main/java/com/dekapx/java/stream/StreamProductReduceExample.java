package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamProductReduceExample {
    public static void main(String[] args) {
        final int[] numbers = {1, 2, 3, 4, 5};
        final IntStream stream = Arrays.stream(numbers);
        int product = stream.reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}
