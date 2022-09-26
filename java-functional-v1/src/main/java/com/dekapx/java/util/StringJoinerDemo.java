package com.dekapx.java.util;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String result = new StringJoiner(", ")
                .add("Java")
                .add("Scala")
                .add("Kotlin")
                .add("Python")
                .add("Rust")
                .toString();
        System.out.println(result);
    }
}
