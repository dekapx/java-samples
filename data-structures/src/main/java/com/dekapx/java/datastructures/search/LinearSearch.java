package com.dekapx.java.datastructures.search;

public class LinearSearch {
    public static void main(String[] args) {
        final int[] elements = {8, 3, 4, 6, 1, 7, 5, 2, 9};
        final int index = linearSearch(elements, 1);
        System.out.println("Fount at position: " + index);
    }

    private static int linearSearch(final int[] elements, final int element) {
        int index = -1;

        for (int i = 0; i < elements.length; i ++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }

        return index;
    }
}
