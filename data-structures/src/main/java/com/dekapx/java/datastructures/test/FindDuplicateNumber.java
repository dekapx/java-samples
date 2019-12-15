package com.dekapx.java.datastructures.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    private static final int[] numbers = {4, 2, 7, 1, 3, 2};

    public static void main(String[] args) {
        findDuplicateNumber(numbers);
    }

    private static int findDuplicateNumber(final int[] numbers) {
        Map map = Arrays.stream(numbers).mapToObj(c -> (int) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
        return -1;
    }
}
