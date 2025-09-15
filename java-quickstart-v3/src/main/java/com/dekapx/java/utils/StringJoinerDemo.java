package com.dekapx.java.utils;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        final StringJoiner joiner = new StringJoiner(" - ", "[", "]")
                .add("Java")
                .add("Python")
                .add("Kotlin")
                .add("GoLang");

        System.out.println(joiner.toString());
    }
}
