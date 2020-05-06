package com.dekapx.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateDemo {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        IntStream.range(1, 6).forEach(i -> list.add(i));
        Stream.generate(generate)
                .limit(5)
                .forEach(System.out::println);
    }

    private static Supplier<Integer> generate = () -> list.remove(0);
}
