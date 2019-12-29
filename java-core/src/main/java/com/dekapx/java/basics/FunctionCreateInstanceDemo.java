package com.dekapx.java.basics;

import com.dekapx.java.model.Dummy;

import java.util.function.Function;

public class FunctionCreateInstanceDemo {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        final Function<String, Dummy> function = Dummy::new;
        final Dummy dummy = function.apply("New State");
        System.out.println(dummy.getState());
    }

    private static void exampleTwo() {
        final Function<String, Dummy> function = (state) -> new Dummy(state);
        final Dummy dummy = function.apply("New State");
        System.out.println(dummy.getState());
    }
}
