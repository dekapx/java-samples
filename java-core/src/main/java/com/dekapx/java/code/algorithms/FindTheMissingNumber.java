package com.dekapx.java.code.algorithms;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        FindTheMissingNumber test = new FindTheMissingNumber();
        int[] elements = {1, 3, 4};
        int missingNumber = test.solution(elements);
        System.out.println(missingNumber);
    }

    public int solution(final int[] elements) {
        int x1 = elements[0];
        int x2 = 1;

        for (int i = 1; i < elements.length; i++) {
            x1 = x1 ^ elements[i];
        }
        for (int i = 2; i <= elements.length + 1; i++) {
            x2 = x2 ^ i;
        }
        return (x1 ^ x2);
    }
}
