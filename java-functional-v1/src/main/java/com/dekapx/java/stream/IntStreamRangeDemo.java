package com.dekapx.java.stream;

import java.util.stream.IntStream;

public class IntStreamRangeDemo {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 5)
                .forEach(i -> System.out.print(i + " "));
    }
}
