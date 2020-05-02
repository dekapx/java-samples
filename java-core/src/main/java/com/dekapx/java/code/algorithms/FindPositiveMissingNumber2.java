package com.dekapx.java.code.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 */
public class FindPositiveMissingNumber2 {
    public static void main(String[] args) {
        int[] input0 = {1, 3, 6, 4, 5, 2, 8};   // Output: 7
        int[] input1 = {1, 3, 6, 4, 1, 2};      // Output: 5
        int[] input2 = {1, 2, 3, 4};            // Output: 5
        int[] input3 = {-1, -3};                // Output: 1

        int missing = getMissingNumber(input3);
        System.out.println(missing);
    }

    public static int getMissingNumber(int[] A) {
        final int[] elements = IntStream.of(A).sorted().toArray();
        final List<Integer> elementsChecked = new ArrayList<>();

        int missing = 1;
        int counter = 0;
        boolean isMissing = false;
        boolean allNegative = true;

        for (int i = 0; i < elements.length; i++) {
            final int current = elements[i];
            if (isPositive(current) && !exists(current, elementsChecked)) {
                elementsChecked.add(current);
                counter ++;
                allNegative = false;

                if (current != counter) {
                    missing = counter;
                    isMissing = true;
                    break;
                }
            }
        }

        if (!isMissing && !allNegative) {
            missing = elements[elements.length - 1] + 1;
        }

        return missing;
    }

    private static boolean isPositive(final int number) {
        return number > 0.0;
    }

    private static boolean exists(final int number, final List<Integer> elementsChecked) {
        return elementsChecked.contains(number);
    }
}
