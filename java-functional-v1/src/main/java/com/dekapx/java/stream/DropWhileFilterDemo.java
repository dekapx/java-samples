package com.dekapx.java.stream;

import java.util.stream.IntStream;

public class DropWhileFilterDemo {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .dropWhile(n -> n < 6)
                .forEach(System.out::println);
    }
}
