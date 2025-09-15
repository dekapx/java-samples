package com.dekapx.java.algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        insertionSort(numbers);
        printElements(numbers);
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    private static void printElements(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
