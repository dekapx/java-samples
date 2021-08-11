package com.dekapx.java.quickstart;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static final String[] elements = {"Java", "Scala", "Kotlin", "GoLang", "Python"};

    public static void main(String[] args) {
        Arrays.stream(elements).forEach(display);
    }

    private static Consumer<String> display = (lang) -> System.out.println(lang);
}

