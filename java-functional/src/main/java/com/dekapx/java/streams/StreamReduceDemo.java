package com.dekapx.java.streams;

import java.util.stream.IntStream;

public class StreamReduceDemo {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 5)
                .peek(i -> System.out.print(i + " "))
                .reduce((x, y) -> x + y).orElse(0);
        System.out.println("\n"+ sum);
    }
}
