package com.dekapx.java;

import java.util.stream.Stream;

public class StreamsWithFilterDemo {
    public static void main(String[] args) {
        final String[] names = {"Alex", "Brian", "Charles", "David"};
        final String name = "Alex";
        final boolean isPresent = Stream.of(names)
                .filter(n -> n.equals(name))
                .findFirst()
                .isPresent();
        System.out.println(isPresent);
    }
}
