package com.dekapx.java.basics;

public class SwapValues {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(String.format("x: %d, y: %d", x, y));

        x = (x + y);
        y = (x - y);
        x = (x - y);

        System.out.println(String.format("x: %d, y: %d", x, y));
    }
}
