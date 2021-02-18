package com.dekapx.java.cleancode;

import java.util.Objects;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        checkNullAndPrint("some value");
        checkNullAndPrintOptional("dummy value");
    }

    private static void checkNullAndPrint(String arg) {
        if (arg != null && arg.length() > 0) {
            System.out.println(arg);
        }
        // OR
        if (Objects.nonNull(arg) && arg.length() > 0) {
            System.out.println(arg);
        }
    }

    private static void checkNullAndPrintOptional(String arg) {
        Optional.ofNullable(arg)
                .filter(a -> a.length() > 0)    // this expression can be a predicate
                .ifPresent(System.out::println);
    }
}
