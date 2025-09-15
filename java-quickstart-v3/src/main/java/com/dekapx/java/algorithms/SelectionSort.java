package com.dekapx.java.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        selectionSort(numbers);
        printElements(numbers);
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }


    private static void printElements(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
