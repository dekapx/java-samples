package com.dekapx.java.datastructures.test;

import java.util.Arrays;

public class FindMinMax {
//    private static final int[] numbers = {4, 2, 7, 1, 3};
    private static final int[] numbers = {4, 2, 6, 5, 1, 3, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Min is : " + findMin(numbers));
        System.out.println("Max is : " + findMax(numbers));
        System.out.println("------------------------");
        System.out.println("- Using Java 8 Streams -");
        System.out.println("------------------------");
        System.out.println("Min is : " + findMinWithStreams(numbers));
        System.out.println("Max is : " + findMaxWithStreams(numbers));
    }

    private static int findMin(final int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    private static int findMax(final int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    private static int findMinWithStreams(final int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    private static int findMaxWithStreams(final int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }
}
