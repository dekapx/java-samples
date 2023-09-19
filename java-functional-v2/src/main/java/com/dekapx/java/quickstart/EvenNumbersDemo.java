package com.dekapx.java.quickstart;

public class EvenNumbersDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i +=2) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            System.out.println(i);
        }
    }
}
