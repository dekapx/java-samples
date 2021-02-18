package com.dekapx.java.cleancode;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Employee;

import java.util.List;
import java.util.Optional;

import static com.dekapx.java.model.Department.ADMINISTRATION;
import static com.dekapx.java.model.Department.ENGINEERING;
import static com.dekapx.java.model.Department.HUMAN_RESOURCES;

public class OptionalNullCheck {
    public static void main(String[] args) {
//        System.out.println(getZipCode(getEmployeeWithData()));
//        System.out.println(getZipCode(getEmployeeWithNoData()));
        optionalWithPredicate(getEmployeeWithData());
    }

    private static void optionalWithPredicate(final Employee employee) {
        Optional.ofNullable(employee)
                .flatMap(emp -> emp.getDepartmentOptional())
                .filter(dept -> dept.equals(HUMAN_RESOURCES))
                .ifPresent(System.out::println);
    }

    private static String getZipCode(final Employee employee) {
        return Optional.ofNullable(employee)
                .map(Employee::getAddress)
                .map(Address::getZipcode)
                .orElse("No Value");
    }

    private static void optionalExampleOne(final Employee employee) {
        Optional.ofNullable(employee)
                .map(Employee::getAddress)
                .map(Address::getZipcode)
                .ifPresent(zipcode -> System.out.println("Zipcode is: " + zipcode));
    }

    private static Employee getEmployeeWithNoData() {
        return Employee.builder().build();
    }

    private static Employee getEmployeeWithData() {
        return Employee.builder().firstName("Craig").lastName("Smith").departmentOptional(Optional.ofNullable(HUMAN_RESOURCES))
                .address(Address.builder()
                        .addressLine1("McCormack House").addressLine2("CityQuarter")
                        .city("Athlone").zipcode("A99 B300").county("Westmeath").build())
                .build();
    }

    private static List<Employee> getEmployees() {
        return List.of(
                Employee.builder().firstName("Jack").lastName("Ryan").departmentOptional(Optional.ofNullable(ENGINEERING))
                        .address(Address.builder()
                                .addressLine1("The Glebe").addressLine2("CityQuarter")
                                .city("Athlone").zipcode("N11 D200").county("Westmeath").build())
                        .build(),
                Employee.builder().firstName("Tom").lastName("McGrath").departmentOptional(Optional.ofNullable(ADMINISTRATION))
                        .address(Address.builder()
                                .addressLine1("The Miew").addressLine2("ParkSide")
                                .city("Balgriffin").zipcode("X44 Y450").county("Dublin").build())
                        .build(),
                Employee.builder().firstName("Craig").lastName("Smith").departmentOptional(Optional.ofNullable(HUMAN_RESOURCES))
                        .address(Address.builder()
                                .addressLine1("McCormack House").addressLine2("CityQuarter")
                                .city("Athlone").zipcode("A99 B300").county("Westmeath").build())
                        .build()
        );
    }
}
