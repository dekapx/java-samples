package com.dekapx.java.basics;

import com.dekapx.java.model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Stream.of("One", "Two", "Three").forEach(System.out::println);
        Stream.of("One", "Two", "Three").map(String::length).forEach(System.out::println);

        List<Person> persons = getPersons();
        persons.stream().map(Person::getFirstName).forEach(System.out::println);
        persons.stream().map(toName).forEach(System.out::println);
    }

    private static Function<Person, String> toName = (person)
            -> person.getFirstName().concat(" ").concat(person.getFirstName());

    private static List<Person> getPersons() {
        return List.of(
                Person.builder().firstName("Rod").lastName("Johnson").build(),
                Person.builder().firstName("Gavin").lastName("King").build(),
                Person.builder().firstName("Robert").lastName("Martin").build()
        );
    }
}
