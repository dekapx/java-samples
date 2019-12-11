package com.dekapx.java.datastructures.test;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * Sorting using Bubble Sort.
 * {4, 2, 7, 1, 3} - {20 Steps} - {16 Steps}
 * {4, 2, 6, 5, 1, 3, 7, 8, 9} - {72 Steps} - {40 Steps}
 */
public class BubbleSort {
    private static final int[] numbers = {4, 2, 7, 1, 3};
//    private static final int[] numbers = {4, 2, 6, 5, 1, 3, 7, 8, 9};

    public static void main(String[] args) {
        sortNumbers(numbers);
        printNumbers(numbers);
    }

    private static void sortNumbers(final int[] numbers) {
        int steps = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i ++) {
            flag = false;
            for (int j = 0; j < numbers.length - 1; j ++) {
                steps ++;
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j);
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println("Total Steps: " + steps);
    }

    private static void swap(final int[] numbers, final int j) {
        int temp = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = temp;
    }

    private static void printNumbers(final int[] numbers) {
        Arrays.stream(numbers).forEach(consumer);
    }

    private static IntConsumer consumer = (num) -> {
        System.out.print(num + " ");
    };
}
