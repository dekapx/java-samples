package com.dekapx.java.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TakeWhileFilterDemo {
    public static void main(String[] args) {
        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .takeWhile(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
