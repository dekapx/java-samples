package com.dekapx.java.coding.problems;

public class FindMax {
    static void main() {
        int[] numbers = {18, 2, 4, 1, 3, 5, 9, 7, 8, 6};

        int max = findMax(numbers);
        System.out.println("Max number is: " + max);

        int secondMax = findSecondMax(numbers);
        System.out.println("Second Max number is: " + secondMax);
    }

    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static int findSecondMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }

}
