package com.dekapx.java.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateDemo {
    public static void main(String[] args) {
        final int start = 1;
        final int limit = 10;
        List<Integer> numbers = Stream.iterate(start, n -> n + 1)
                .limit(limit)
                .collect(Collectors.toList());
        System.out.println(numbers);

        Stream.iterate(LocalDate.now(), ld -> ld.plusMonths(1L))
                .limit(5)
                .forEach(System.out::println);
    }
}
