package com.dekapx.java.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPartitioningByDemo {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> map = IntStream.rangeClosed(1, 10)
                .mapToObj(Integer::new)
                .collect(Collectors.partitioningBy(i -> i > 5));

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
