package com.dekapx.java.cleancode;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Employee;

import java.util.Optional;

import static com.dekapx.java.model.Department.HUMAN_RESOURCES;

public class Example8 {
    public static void main(String[] args) {
        getZipCodeAsOptional(getEmployeeWithData())
                .ifPresent(zipCode -> System.out.println(zipCode));

        getZipCodeAsOptional(getEmployeeWithNoData())
                .ifPresent(zipCode -> System.out.println(zipCode));

        System.out.println("---------");

        System.out.println(getZipCodeWithDefault(getEmployeeWithData()));
        System.out.println(getZipCodeWithDefault(getEmployeeWithNoData()));
    }

    private static Optional<String> getZipCodeAsOptional(Employee employee) {
        return Optional.ofNullable(employee)
                .map(Employee::getAddress)
                .map(Address::getZipcode)
                .stream()
                .findFirst();
    }

    private static String getZipCodeWithDefault(Employee employee) {
        return Optional.ofNullable(employee)
                .map(Employee::getAddress)
                .map(Address::getZipcode)
                .orElse("No Value");
    }

    private static Employee getEmployeeWithNoData() {
        return Employee.builder().build();
    }

    private static Employee getEmployeeWithData() {
        return Employee.builder().firstName("Jim").lastName("Carrey").departmentOptional(Optional.ofNullable(HUMAN_RESOURCES))
                .address(Address.builder()
                        .addressLine1("2121").addressLine2("El Comino Real")
                        .city("San Mateo").zipcode("94403").county("CA").build())
                .build();
    }
}
