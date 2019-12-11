package com.dekapx.java.datastructures.test;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * Sorting using Selection Sort.
 * {4, 2, 7, 1, 3} - {15 Steps} - {9 Steps}
 * {4, 2, 6, 5, 1, 3, 7, 8, 9} - {45 Steps} - {17 - Steps}
 */
public class SelectionSort {
//    private static final int[] numbers = {4, 2, 7, 1, 3};
    private static final int[] numbers = {4, 2, 6, 5, 1, 3, 7, 8, 9};

    public static void main(String[] args) {
        sortNumbers(numbers);
        printNumbers(numbers);
    }

    private static void sortNumbers(final int[] numbers) {
        int steps = 0;

        for (int i = 0; i < numbers.length; i ++) {
            boolean flag = false;
            int min = numbers[i];
            int pos = i;

            for (int j = i; j < numbers.length; j ++) {
                steps ++;
                if (numbers[j] < min) {
                    min = numbers[j];
                    pos = j;
                    flag = true;
                }
            }
            if (flag) {
                int temp = numbers[i];
                numbers[i] = min;
                numbers[pos] = temp;
            } else {
                break;
            }

        }
        System.out.println("Total Steps: " + steps);
    }

    private static void printNumbers(final int[] numbers) {
        Arrays.stream(numbers).forEach(consumer);
    }

    private static IntConsumer consumer = (num) -> {
        System.out.print(num + " ");
    };
}
