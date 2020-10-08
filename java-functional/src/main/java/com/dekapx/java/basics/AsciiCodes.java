package com.dekapx.java.basics;

public class AsciiCodes {
    public static void main(String[] args) {
        for (int i = 65; i < 91; i++) {
            char chr = (char) i;
            System.out.print(chr + " ");
        }
        System.out.println("");
        for (int i = 97; i < 123; i++) {
            char chr = (char) i;
            System.out.print(chr + " ");
        }
    }
}
