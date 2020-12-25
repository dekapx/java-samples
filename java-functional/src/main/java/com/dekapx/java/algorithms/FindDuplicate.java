package com.dekapx.java.algorithms;

public class FindDuplicate {
    public static void main(String[] args) {
        final int[] numbers = {5, 8, 4, 1, 6, 9, 7, 2, 9, 3};
        System.out.println("Duplicate: " + findDuplicate(numbers));
    }

    private static int findDuplicate(final int[] numbers) {
        int duplicateNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j ++) {
                if (numbers[i] == numbers[j]) {
                    duplicateNumber = numbers[j];
                }
            }
        }
        return duplicateNumber;
    }
}
