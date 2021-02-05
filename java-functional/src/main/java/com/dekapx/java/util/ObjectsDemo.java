package com.dekapx.java.util;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        checkNull(null);
        checkNotNull("test");

        final String arg = null;
        Objects.requireNonNull(arg, () -> "Object must not be null or empty");
    }

    private static void checkNull(final String arg) {
        if (Objects.isNull(arg)) {
            System.out.println("Argument is null...");
        }
    }

    private static void checkNotNull(final String arg) {
        if (Objects.nonNull(arg)) {
            System.out.println("Argument is not null...");
        }
    }
}
