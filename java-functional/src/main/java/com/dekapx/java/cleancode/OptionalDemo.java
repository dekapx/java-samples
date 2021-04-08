package com.dekapx.java.cleancode;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        display("Hello World");
    }

    private static void display(String arg) {
        System.out.println(Optional.ofNullable(arg).orElse("No Value"));
    }
}
