package com.dekapx.java.algorithms;

public class FindDuplicateNumberCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 9, 8, 9, 7, 9, 2, 1, 3, 7, 9, 4, 6, 3, 5};
        int[] duplicateNumbers = countDuplicateNumbers(numbers);
        for (int i = 0; i < duplicateNumbers.length; i++) {
            if (duplicateNumbers[i] > 1) {
                System.out.println("Number: " + i + " Count: " + duplicateNumbers[i]);
            }
        }
    }

    private static int[] countDuplicateNumbers(int[] numbers) {
        int[] elements = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            elements[numbers[i]]++;
        }
        return elements;
    }
}
