package com.dekapx.java.algorithms;

import java.util.Arrays;

/**
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
 * Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
 */
public class RotateArray {
    public static void main(String[] args) {
        int rotatedBy = 2;
        int[] elements = {1, 2, 3, 4, 5};
        RotateArray rotateArray = new RotateArray();
        int[] result = rotateArray.rotateArray(elements, rotatedBy);
        print(result);
    }

    private int[] rotateArray(int[] elements, int rotatedBy) {
        for (int i = 0; i < rotatedBy; i++) {
            int length = elements.length;
            int[] copy = new int[length];
            int firstElement = elements[0];
            for (int j = 1; j < elements.length; j++) {
                copy[j - 1] = elements[j];
            }
            copy[length - 1] = firstElement;
            elements = copy;
        }

        return elements;
    }

    private static void print(int[] elements) {
        Arrays.stream(elements).forEach(i -> System.out.print(i + " "));
    }
}
