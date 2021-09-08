package com.dekapx.java.quickstart;

import java.util.stream.IntStream;

public class IntStreamReduceSumDemo {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 5)
                .reduce((x, y) -> x + y)
                .orElse(0);
        System.out.println(sum);
    }
}
