package com.dekapx.java.basics;

import com.dekapx.java.function.TriFunction;
import com.dekapx.java.model.Person;
import com.dekapx.java.model.PersonHelper;
import com.dekapx.java.model.PersonVO;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEntityConvertor {
    public static void main(String[] args) {
        final List<PersonVO> personVos = PersonHelper.getPersons();
        final List<Person> persons = personVos.stream()
                .map(toPerson)
                .collect(Collectors.toList());
        display(persons);
    }

    private static Function<PersonVO, Person> toPerson = (vo) -> {
        final TriFunction<String, String, String, Person> triFunction = (fname, lname, email) ->
                new Person(fname, lname, email);
        return triFunction.apply(vo.getFirstName(), vo.getLastName(), vo.getEmail());
    };

    private static void display(List<Person> persons) {
        persons.forEach(person -> System.out.println(person));
    }
}
