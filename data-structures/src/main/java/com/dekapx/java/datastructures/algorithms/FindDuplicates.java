package com.dekapx.java.datastructures.algorithms;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class FindDuplicates {
    public static void main(String[] args) {
        final int[] numbers = {2, 3, 1, 8, 5, 3, 1, 6, 8, 7, 2, 8, 1};

        findDuplicates(numbers);
    }

    private static void findDuplicates(final int[] numbers) {
        int[] duplicates = new int[0];

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                duplicates = addToDuplicates(duplicates, numbers[i]);
            }
        }

        print(duplicates);
    }

    private static int[] addToDuplicates(int[] duplicates, final int number) {
        if (!existsUsingStream(duplicates, number)) {
            final int length = duplicates.length;
            duplicates = Arrays.copyOf(duplicates, length + 1);
            duplicates[length] = number;
        }

        return duplicates;
    }

    private static boolean exists(final int[] duplicates, final int number) {
        boolean exists = false;
        if (duplicates.length == 0) {
            return exists;
        }

        for (int i = 0; i < duplicates.length; i++) {
            if (duplicates[i] == number) {
                exists = true;
            }
        }
        return exists;
    }

    private static boolean existsUsingStream(final int[] duplicates, final int number) {
        if (duplicates.length == 0) {
            return false;
        }

        return Arrays.stream(duplicates).filter(i -> i == number).findAny().isPresent();
    }

    private static void print(final int[] numbers) {
        System.out.print("Duplicates are : ");
        Arrays.stream(numbers).forEach(printConsumer);
    }

    private static IntConsumer printConsumer = (number) -> {
        System.out.print(number + " ");
    };

}

