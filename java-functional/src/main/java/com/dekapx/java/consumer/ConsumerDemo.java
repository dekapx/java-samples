package com.dekapx.java.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> elements = List.of("Java", "Scala", "Kotlin", "GOLang");
        elements.forEach(e -> System.out.println(e));
        elements.forEach(System.out::println);
        elements.forEach(print1);
        elements.forEach(e -> print2.accept("[" , e , "]"));
    }

    static Consumer<String> print1 = (e) -> System.out.println(e);

    static TriConsumer<String, String, String> print2 = (first, second, third) -> {
        System.out.println(first + second + third);
    };
}
