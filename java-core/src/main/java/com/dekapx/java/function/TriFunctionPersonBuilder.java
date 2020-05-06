package com.dekapx.java.function;

import com.dekapx.java.model.Person;

public class TriFunctionPersonBuilder {
    public static void main(String[] args) {
        final TriFunction<String, String, String, Person> triFunction = (fname, lname, email) -> new Person(fname, lname, email);
        final Person person = triFunction.apply("De", "Kapx", "dekapx@kapxinc.com");
        System.out.println(person);
    }
}
