package com.dekapx.java.cleancode;

public class Example1 {
    public static void main(String[] args) {
        new Test("test").printLength();
        new Test(null).printLength();
    }

    static class Test {
        private String arg;

        Test(String arg) {
            this.arg = arg;     // TODO: perform null check here...
        }

        void printLength() {
            System.out.println(this.arg.toUpperCase() + " [" + this.arg.length() + "]");
        }
    }
}
