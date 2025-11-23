package com.dekapx.java.datatypes;

public class BoxingUnboxingDemo {
    static void main() {
        boxing();
        unBoxing();
    }

    private static void boxing() {
        int i = 10;
        Integer value = Integer.valueOf(i);
        System.out.println(value);
    }

    private static void unBoxing() {
        Integer value = Integer.valueOf(20);
        int i = value.intValue();
        System.out.println(i);
    }
}
