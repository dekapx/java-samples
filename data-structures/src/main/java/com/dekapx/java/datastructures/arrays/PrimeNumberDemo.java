package com.dekapx.java.datastructures.arrays;

import java.util.stream.IntStream;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        System.out.println("2 is Prime: " + isPrime(2));
        System.out.println("3 is Prime: " + isPrime(3));
        System.out.println("4 is Prime: " + isPrime(4));
        System.out.println("5 is Prime: " + isPrime(5));
    }
    public static boolean isPrime(int number) {
        return number > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
    }
}

