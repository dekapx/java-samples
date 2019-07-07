package com.dekapx.java.datastructures.sort;

import java.util.Arrays;
import java.util.function.Consumer;

public class SelectionSort {
    public static void main(String[] args) {
        final int[] elements = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        sort(elements);
    }

    private static void sort(final int[] elements) {
        print(elements);

        int steps = 0;
        for (int i = 0; i < elements.length; i++) {
            boolean flag = false;
            int index = i;
            int min = elements[index];
            for (int j = i; j < elements.length; j++) {
                if (elements[j] < min) {
                    index = j;
                    min = elements[index];
                    flag = true;
                }
                steps++;
            }

            if (flag) {
                int temp = elements[i];
                elements[i] = elements[index];
                elements[index] = temp;
            } else {
                break;
            }
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

