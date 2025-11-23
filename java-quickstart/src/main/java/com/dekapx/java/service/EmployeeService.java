package com.dekapx.java.service;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Department;
import com.dekapx.java.model.Employee;

import java.util.List;

import static com.dekapx.java.model.Department.*;

public class EmployeeService {
    public Employee findById(final Long id) {
        return createEmployee(1L, "John", "Doe", "John.Doe@hotmail.com", IT,
                createAddress("1830", "Gateway Drive", "San Mateo", "CA", "94403"));
    }

    public List<Employee> findAll() {
        return List.of(
                createEmployee(1L, "John", "Doe", "John.Doe@hotmail.com", IT,
                        createAddress("1830", "Gateway Drive", "San Mateo", "CA", "94403")),
                createEmployee(2L, "Jane", "Doe", "Jane.Doe@gmail.com", IT,
                        createAddress("2121", "El Camino Real", "San Mateo", "CA", "94404")));
    }

    private static Employee createEmployee(Long id,
                                           String firstName,
                                           String lastName,
                                           String email,
                                           Department department,
                                           Address address) {
        return Employee.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .department(department)
                .address(address)
                .build();
    }

    private static Address createAddress(String addressLine1,
                                         String addressLine2,
                                         String city,
                                         String state,
                                         String zipCode) {
        return Address.builder()
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .city(city)
                .state(state)
                .zipCode(zipCode)
                .build();
    }

}
