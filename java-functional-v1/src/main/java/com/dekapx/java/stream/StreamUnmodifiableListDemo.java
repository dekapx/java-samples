package com.dekapx.java.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamUnmodifiableListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .filter(i -> i > 5)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(numbers);
    }
}
