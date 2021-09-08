package com.dekapx.java.quickstart;

import java.math.BigDecimal;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args) {
        IntStream.range(1, 5)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n-----------");

        IntStream.rangeClosed(1, 5)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n-----------");

        Stream.iterate(BigDecimal.ONE, i -> i.add(BigDecimal.ONE))
                .limit(5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println("\n-----------");
        Stream.generate(generateNumbers)
                .limit(5)
                .forEach(i -> System.out.print(i + " "));

    }

    private static Supplier<Long> generateNumbers = () ->
            Math.round(Math.random());
}
