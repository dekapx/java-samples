package com.dekapx.java.basics;

import java.util.stream.IntStream;

/**
 that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 Given A = [1, 2, 3], the function should return 4.
 Given A = [−1, −3], the function should return 1.
 */
public class Test {
    public static void main(String[] args) {
        int[] input4 = {1, 3, 6, 4, 5, 2, 8};
        int[] input1 = {1, 3, 6, 4, 1, 2};
        int[] input2 = {1, 2, 3};
        int[] input3 = {-1, -3};

        Test test = new Test();
        int missing = test.solution(input1);
        System.out.println(missing);
    }

    public int solution(int[] input) {
        int[] elements = IntStream.of(input).sorted().toArray();

        int missing = -1;
        for (int i = 0; i < elements.length; i ++) {
            if (i < elements.length - 1) {
                if (elements[i +1] - elements[i] > 1) {
                    if (isPositive(elements[i])) {
                        missing = elements[i] + 1;
                    }
                }
            }
        }

        if (missing == -1) {
            missing = elements[elements.length - 1] + 1;
            while (true) {
                if (!isPositive(missing)) {
                    missing ++;
                } else {
                    break;
                }
            }
        }
        return missing;
    }

    private boolean isPositive(final int number) {
        return number > 0.0;
    }
}
