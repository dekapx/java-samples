package com.dekapx.java.datastructures.sort;

import java.util.Arrays;
import java.util.function.Consumer;

public class BubbleSort {
    public static void main(String[] args) {
        final int[] elements = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        sort(elements);
    }

    private static void sort(final int[] elements) {
        print(elements);
        int steps = 0;
        for (int i = 0; i < elements.length; i++) {
            boolean flag = false;
            for (int j = 0; j < elements.length - 1; j++) {
                if (isNextElementSmaller(elements, j)) {
                    flag = true;
                    swap(elements, j);
                }
                steps++;
            }
            if (!flag) break;
        }
        print(elements);
        System.out.println("Total Steps: " + steps);
    }

    private static boolean isNextElementSmaller(final int[] elements, final int index) {
        return elements[index] > elements[index + 1];
    }

    private static void swap(int[] elements, int index) {
        final int temp = elements[index];
        elements[index] = elements[index + 1];
        elements[index + 1] = temp;
    }

    private static void print(final int[] elements) {
        Arrays.stream(elements).forEach(i -> printConsumer.accept(i));
        System.out.println("");
    }

    private static Consumer<Integer> printConsumer = (element) -> {
        System.out.print(element + " ");
    };
}

