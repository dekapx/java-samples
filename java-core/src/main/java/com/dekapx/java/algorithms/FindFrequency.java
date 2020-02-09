package com.dekapx.java.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {
        final List<Character> elements = Arrays.asList('g', 'e', 'e', 'k', 's');
        System.out.println(countByStreamGroupBy(elements, 'e'));
    }

    public static Long countByStreamGroupBy(List<Character> inputList, Character chr) {
        return inputList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).get(chr);
    }
}
