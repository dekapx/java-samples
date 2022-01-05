package com.dekapx.java.util;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String output = new StringJoiner(", ", "[", "]")
                .add("Java")
                .add("Scala")
                .add("Kotlin")
                .toString();
        System.out.println(output);
    }
}
