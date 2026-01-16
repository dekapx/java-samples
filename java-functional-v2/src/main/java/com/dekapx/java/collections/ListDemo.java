package com.dekapx.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListDemo {
    static void main() {
        List<String> elements = new ArrayList<>();
        IntStream.range(0, 5).forEach(i -> {
            elements.add("Element-" + i);
        });
        elements.forEach(System.out::println);
    }
}
