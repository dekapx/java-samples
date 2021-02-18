package com.dekapx.java.cleancode;

import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        new Test(null).printLength();
    }

    static class Test {
        private String arg;

        Test(String arg) {
            this.arg = Objects.requireNonNull(arg, "Argument must not be null...");
        }

        void printLength() {
            System.out.println(this.arg + " length is " + this.arg.length());
        }
    }
}
