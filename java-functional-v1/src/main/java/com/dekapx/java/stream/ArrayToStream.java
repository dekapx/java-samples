package com.dekapx.java.stream;

import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Scala", "Python", "Kotlin", "Ruby");
        stream.sorted().forEach(i -> System.out.println(i));
    }
}
