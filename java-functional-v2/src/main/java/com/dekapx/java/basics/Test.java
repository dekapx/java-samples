package com.dekapx.java.basics;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "JavaScript", "C#", "C++");
        list.forEach(System.out::println);
    }
}
