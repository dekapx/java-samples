package com.dekapx.java.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        bubbleSort(numbers);
        printElements(numbers);
    }

    private static void bubbleSort(int[] numbers) {
        int steps = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean swap = false;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    performSwap(numbers, j);
                    swap = true;
                }
                steps++;
            }
            if (!swap) {
                break;
            }
        }
        System.out.println("Steps: " + steps);
    }

    private static void performSwap(int[] numbers, int j) {
        int temp = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = temp;
    }

    private static void printElements(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
