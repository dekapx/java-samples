package com.dekapx.java.stream;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
//        List<String> cities = getCities(getStudents());
//        cities.forEach(System.out::println);

        Map<String, Long> addressesByCity = getCityCount(getStudents());
        addressesByCity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " [" + entry.getValue() + "]"));
    }

    private static List<String> getCities(List<Student> students) {
        return students.stream()
                .map(Student::getAddresses)
                .flatMap(addresses -> addresses.stream())
                .map(Address::getCity)
                .sorted()
                .collect(Collectors.toList());
    }

    private static Map<String, Long> getCityCount(List<Student> students) {
        return students.stream()
                .map(Student::getAddresses)
                .flatMap(addresses -> addresses.stream())
                .map(Address::getCity)
                .sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


    private static List<Student> getStudents() {
        return List.of(
                Student.builder()
                        .firstName("Joe").lastName("Duffy").addresses(List.of(
                                Address.builder().addressLine("Exit 5, M50, Charlestown").city("Dublin").county("Dublin").build()
                        )).build(),
                Student.builder()
                        .firstName("Frank").lastName("Keane").addresses(List.of(
                                Address.builder().addressLine("Temple Road, Blackrock").city("Dublin").county("Dublin").build()
                        )).build(),
                Student.builder()
                        .firstName("Colm").lastName("Quinn").addresses(List.of(
                                Address.builder().addressLine("1 ").city("Athlone").county("Westmeath").build()
                        )).build()
        );
    }
}
