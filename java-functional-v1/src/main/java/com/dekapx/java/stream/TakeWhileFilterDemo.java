package com.dekapx.java.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeWhileFilterDemo {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .takeWhile(n -> n < 6)
                .forEach(System.out::println);
    }
}
