package com.dekapx.java.basics;

import java.util.stream.IntStream;

/**
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 */
public class FindPositiveMissingNumber2 {
    public static void main(String[] args) {
        int[] input1 = {1, 3, 6, 4, 1, 2};
        int[] input2 = {1, 3, 6, 4, 5, 2, 8};
        int[] input3 = {1, 2, 3};
        int[] input4 = {-1, -3};

        System.out.println(getMissingNumber(input1));
    }

    public static int getMissingNumber(int[] input) {
        int[] elements = IntStream.of(input).sorted().toArray();

        int missing = 1;
        int counter = 1;
        for (int i = 0; i < elements.length; i ++) {
            if (isPositive(elements[i])) {
                counter ++;
            }
            if (counter != elements[i]) {
                missing = counter;
            }
        }

        return missing;
    }

    private static boolean isPositive(final int number) {
        return number > 0.0;
    }
}
