package com.dekapx.java.model;

import com.dekapx.java.function.TriFunction;

import java.util.ArrayList;
import java.util.List;

public class PersonHelper {
    public static List<PersonVO> getPersons() {
        final List<PersonVO> persons = new ArrayList<>();
        persons.add(getPersonVO());
        return persons;
    }

    private static PersonVO getPersonVO() {
        final TriFunction<String, String, String, PersonVO> triFunction = (fname, lname, email) -> new PersonVO(fname, lname, email);
        return triFunction.apply("De", "Kapx", "dekapx@kapxinc.com");
    }
}
