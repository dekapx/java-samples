package com.dekapx.java.algorithms;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("Before: x: " + x + ", y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After: x: " + x + ", y: " + y);
    }
}
