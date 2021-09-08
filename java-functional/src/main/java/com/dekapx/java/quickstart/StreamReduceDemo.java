package com.dekapx.java.quickstart;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamReduceDemo {
    public static final String[] languages = {"Java", "Scala", "Kotlin", "GoLang", "Python"};
    public static void main(String[] args) {
        OptionalInt max = Arrays.stream(languages)
                .mapToInt(String::length)
                .max();
        System.out.println(max.getAsInt());
    }
}
