package com.dekapx.java.algorithms;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 9, 8, 9, 7};
        boolean hasDuplicateNumber = containDuplicateNumber(numbers);
        System.out.println("Duplicate Number: " + hasDuplicateNumber);
    }

    private static boolean containDuplicateNumber(int[] numbers) {
        int[] elements = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (elements[numbers[i]] == 1) {
                System.out.println("Duplicate Number: " + numbers[i]);
                return true;
            }
            elements[numbers[i]] = 1;
        }
        return false;
    }
}
