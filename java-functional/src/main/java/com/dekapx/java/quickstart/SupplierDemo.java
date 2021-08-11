package com.dekapx.java.quickstart;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<HelloWorld> supplier = HelloWorldImpl::new;
        test(supplier);
    }

    private static void test(Supplier<HelloWorld> supplier) {
        final String str = supplier.get().sayHello("Test");
        System.out.println(str);
    }
}
