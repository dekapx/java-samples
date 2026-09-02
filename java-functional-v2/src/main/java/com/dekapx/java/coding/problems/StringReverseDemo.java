package com.dekapx.java.coding.problems;

public class StringReverseDemo {
    static void main() {
        String input = "HelloWorld";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverseUsingArray(input));
        System.out.println("Output: " + reverseUsingStringBuilder(input));
    }

    private static String reverseUsingArray(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    private static String reverseUsingStringBuilder(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
