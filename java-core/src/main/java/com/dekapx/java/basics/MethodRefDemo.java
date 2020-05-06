package com.dekapx.java.basics;

import java.util.List;

class Validator {
    public static void printLength(String arg) {
        System.out.println(arg + " : " + arg.length());
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Tom", "Bruce", "Matt");
        names.forEach(Validator::printLength);
    }
}
