package com.dekapx.java.string;

public class StringFormatDemo {
    public static void main(String[] args) {
        final String name = "Test";
        final int age = 20;

        final String output = String.format("Name [%s], Age [%s]", name, age);
        System.out.println(output);
    }
}
