package com.dekapx.java.basics;

import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Predicate;

import static java.util.Objects.nonNull;

public class HelloWorld {
    private static Predicate<String> checkNotNullAndEmpty(String arg) {
        return o -> nonNull(o) && !o.isEmpty();
    }

    public String sayHello(String arg) {
        Optional.ofNullable(arg)
                .filter(checkNotNullAndEmpty(arg))
                .orElseThrow(IllegalArgumentException::new);

        return new StringJoiner(" ! ")
                .add("Hello")
                .add(arg)
                .toString();
    }
}
