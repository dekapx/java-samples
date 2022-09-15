package com.dekapx.java.stream;

import java.util.stream.Stream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("Foo");
        Stream<String> s2 = Stream.of("Bar");

        Stream.concat(s1, s2).forEach(System.out::println);

    }
}
