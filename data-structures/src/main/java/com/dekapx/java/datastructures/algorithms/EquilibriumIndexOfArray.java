package com.dekapx.java.datastructures.algorithms;

public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        final int[] numbers = {4, 1, 2, 3, 3};
        System.out.println(collectionEquilibrium(numbers));
    }

    private static int collectionEquilibrium(final int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            int difference = 0;

            for (int i = index - 1; i > -1; i--) {
                difference += numbers[i];
            }
            System.out.println();
            for (int i = index + 1; i < numbers.length; i++) {
                difference -= numbers[i];
            }

            if (difference == 0) {
                return 1;
            }
        }

        return 0;
    }

}
