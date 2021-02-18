package com.dekapx.java.cleancode;

import com.dekapx.java.model.Address;
import com.dekapx.java.model.Employee;

import java.util.Optional;

import static com.dekapx.java.model.Department.HUMAN_RESOURCES;

public class Example7 {
    public static void main(String[] args) {
        String zipCode = getZipCode(getEmployeeWithData());
        if (zipCode != null) {
            System.out.println(zipCode);
        }

        System.out.println(getZipCodeOrDefaultValue(getEmployeeWithNoData()));
    }

    private static String getZipCode(Employee employee) {
        if (employee != null && employee.getAddress() != null && employee.getAddress().getZipcode() != null) {
            return employee.getAddress().getZipcode();
        }
        return null;
    }

    private static String getZipCodeOrDefaultValue(Employee employee) {
        if (employee != null && employee.getAddress() != null && employee.getAddress().getZipcode() != null) {
            return employee.getAddress().getZipcode();
        } else {
            return "No Value";
        }
    }

    private static Employee getEmployeeWithNoData() {
        return Employee.builder().build();
    }

    private static Employee getEmployeeWithData() {
        return Employee.builder().firstName("Jim").lastName("Carrey").departmentOptional(Optional.ofNullable(HUMAN_RESOURCES))
                .address(Address.builder()
                        .addressLine1("1830").addressLine2("Gateway Drive")
                        .city("San Mateo").zipcode("94404").county("CA").build())
                .build();
    }
}
