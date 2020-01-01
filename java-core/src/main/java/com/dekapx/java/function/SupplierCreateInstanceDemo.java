package com.dekapx.java.function;

import com.dekapx.java.model.Dummy;

import java.util.function.Supplier;

public class SupplierCreateInstanceDemo {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        final Supplier<Dummy> supplier = Dummy::new;
        final Dummy dummy = supplier.get();
        System.out.println(dummy.getState());
    }

    private static void exampleTwo() {
        final Supplier<Dummy> supplier = () -> new Dummy();
        final Dummy dummy = supplier.get();
        System.out.println(dummy.getState());
    }
}
