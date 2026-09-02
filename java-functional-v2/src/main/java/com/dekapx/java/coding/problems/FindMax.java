package com.dekapx.java.coding.problems;

public class FindMax {
    static void main() {
        int[] numbers = {2, 4, 1, 3, 5, 9, 7, 8, 6};

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
}
