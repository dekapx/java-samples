package com.dekapx.java.basics;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 5, 6, 2};
        selectionSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }
}

