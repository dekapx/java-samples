package com.dekapx.java.function;

import com.dekapx.java.model.Person;

@FunctionalInterface
interface TriFunction<T1, T2, T3, R> {
    R apply(T1 t1, T2 t2, T3 t3);
}

public class TriFunctionPersonBuilder {
    public static void main(String[] args) {
        final TriFunction<String, String, String, Person> triFunction = (fname, lname, email) -> new Person(fname, lname, email);
        final Person person = triFunction.apply("De", "Kapx", "dekapx@aol.com");
        System.out.println(person);
    }
}
