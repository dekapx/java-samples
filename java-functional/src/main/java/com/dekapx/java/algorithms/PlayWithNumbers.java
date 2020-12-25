package com.dekapx.java.algorithms;

public class PlayWithNumbers {
    public static void main(String[] args) {
        final int[] numbers = {5, 8, 4, 1, 6, 9, 7, 2, 3};
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Max: " + findMax(numbers));
    }

    private static int findMin(final int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i ++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    private static int findMax(final int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i ++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}
