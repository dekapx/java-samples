package com.dekapx.java.datastructures.arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        final int[] elements = {2, 3, 4, 6, 7, 8};

        final int[] newElements = insertAtAnyPosition(elements, 1, 0);
        for (int i = 0; i < newElements.length; i++) {
            System.out.print(newElements[i] + " ");
        }
    }

    public static int[] insertAtStart(final int[] elements, final int element) {
        final int[] newElements = new int[elements.length + 1];

        newElements[0] = element;
        for (int i = 0; i < newElements.length - 1; i++) {
            newElements[i + 1] = elements[i];
        }

        return newElements;
    }

    public static int[] insertAtEnd(final int[] elements, final int element) {
        final int[] newElements = new int[elements.length + 1];

        for (int i = 0; i < newElements.length - 1; i++) {
            newElements[i] = elements[i];
        }
        newElements[newElements.length - 1] = element;

        return newElements;
    }

    public static int[] insertAtAnyPosition(final int[] elements, final int element, final int position) {
        final int[] newElements = new int[elements.length + 1];

        int index = 0;

        newElements[position] = element;
        for (int i = 0; i < newElements.length - 1; i++) {
            if (position == i) {
                index++;
            }
            newElements[index] = elements[i];
            index++;
        }

        return newElements;
    }
}

