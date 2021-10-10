package com.dekapx.java.quickstart;

import com.dekapx.java.model.Person;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
    }

    private static Person buildPerson(String arg1, String arg2, String arg3) {
        Supplier<Person> supplier = () -> new Person(arg1, arg2, arg3);
        return supplier.get();
    }
}
