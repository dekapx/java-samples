package com.dekapx.java.quickstart;

import java.util.stream.Stream;

public class StreamConcatDemo {
    public static void main(String[] args) {
        final Stream<String> s1 = Stream.of("Java", "Scala");
        final Stream<String> s2 = Stream.of("Python", "GoLang");

        Stream<String> combinedStream = Stream.concat(s1, s2);
        combinedStream.forEach(System.out::println);
    }
}
