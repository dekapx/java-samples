package com.dekapx.java.basics;

import java.util.List;

public class VarKeywordDemo {
    public static void main(String[] args) {
        var num = 10;
        System.out.println(num);

        var languages = List.of("Java", "Scala", "Kotlin");
        languages.forEach(l -> System.out.print(l + " "));
    }

}
