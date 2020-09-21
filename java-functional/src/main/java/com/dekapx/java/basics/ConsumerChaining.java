package com.dekapx.java.basics;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        printBefore.andThen(printAfter).accept("Hello");
    }

    private static Consumer<String> printBefore = (arg)
            -> System.out.println(arg.length());

    private static Consumer<String> printAfter = (arg)
            -> System.out.println(arg.toUpperCase());
}
