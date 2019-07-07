package com.dekapx.java.datastructures.sort;

import java.util.Arrays;
import java.util.function.Consumer;

public class InsertionSort {
    public static void main(String[] args) {
        final int[] elements = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        sort(elements);
    }

    private static void sort(final int[] elements) {
        print(elements);

        int steps = 0;
        for (int i = 1; i < elements.length; i++) {
            boolean flag = false;
            for (int j = i; j > 0; j--) {
                if (elements[j] < elements[j - 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j - 1];
                    elements[j - 1] = temp;
                    flag = true;
                }
                steps++;
            }
            if (!flag) break;
        }
        print(elements);
        System.out.println("Total Steps: " + steps);
    }

    private static void print(final int[] elements) {
        Arrays.stream(elements).forEach(i -> printConsumer.accept(i));
        System.out.println("");
    }

    private static Consumer<Integer> printConsumer = (element) -> {
        System.out.print(element + " ");
    };
}

