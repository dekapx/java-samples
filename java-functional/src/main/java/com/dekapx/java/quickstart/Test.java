package com.dekapx.java.quickstart;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.forEach(s -> System.out.println(s));
    }
}