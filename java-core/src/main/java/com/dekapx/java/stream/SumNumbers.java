package com.dekapx.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumNumbers {
    public static void main(String[] args) {
        sumIntegers();
        sumDoubles();
    }

    private static void sumIntegers() {
        IntStream intNumbers = IntStream.range(0, 3);
        int sum = intNumbers.reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void sumDoubles() {
        List<Double> doubleNumbers = Arrays.asList(23.48, 52.26, 13.5);
        double result = doubleNumbers.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println(result);
    }
}
