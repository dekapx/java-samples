package com.dekapx.java.streams;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFlatMapDemo {
    static void main() {
        List<Person> persons = getPerson();
        List<String> cities = persons
                .stream()
                .flatMap(person -> person.getAddresses().stream())
                .map(Address::getCity)
                .toList();
        IO.println(cities);

        Map<String, List<String>> cityByPerson = persons
                .stream()
                .collect(Collectors.toMap(
                        person -> person.getFirstName() + " " + person.getLastName(),
                        person -> person.getAddresses()
                                .stream()
                                .map(Address::getCity)
                                .collect(Collectors.toList())
                ));
        IO.println(cityByPerson);

    }

    private static List<Person> getPerson() {
        return List.of(
                Person.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .addresses(List.of(
                                Address.builder()
                                        .houseNo("123")
                                        .street("Main St")
                                        .city("Dublin")
                                        .state("IL")
                                        .zipCode("62701")
                                        .build()))
                        .build(),
                Person.builder()
                        .firstName("Jane")
                        .lastName("Smith")
                        .addresses(List.of(
                                Address.builder()
                                        .houseNo("456")
                                        .street("Oak St")
                                        .city("Dublin")
                                        .state("NY")
                                        .zipCode("10001")
                                        .build(),
                                Address.builder()
                                        .houseNo("789")
                                        .street("Pine St")
                                        .city("Galway")
                                        .state("NJ")
                                        .zipCode("07097")
                                        .build()))
                        .build());
    }
}
