package com.dekapx.java.collections;

import com.dekapx.java.model.Department;
import com.dekapx.java.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.dekapx.java.model.Department.FINANCE;
import static com.dekapx.java.model.Department.HR;
import static com.dekapx.java.model.Department.IT;
import static com.dekapx.java.model.Department.MARKETING;

public class GroupByCollectDemo {
    static void main() {
        Map<Department, Long> employeeCountByDepartment = getEmployeeCountByDepartment();
        System.out.println(employeeCountByDepartment);

        Map<Department, List<Employee>> employeesByDepartment = getEmployeesByDepartment();
        for (Map.Entry<Department, List<Employee>> entry : employeesByDepartment.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Department, Long> getEmployeeCountByDepartment() {
        List<Employee> employees = getEmployees();
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

    }

    private static Map<Department, List<Employee>> getEmployeesByDepartment() {
        List<Employee> employees = getEmployees();
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    private static List<Employee> getEmployees() {
        return List.of(
                Employee.builder().firstName("John").lastName("Doe").email("john.doe@company.com").department(HR).build(),
                Employee.builder().firstName("Jane").lastName("Smith").email("jane.smith@company.com").department(IT).build(),
                Employee.builder().firstName("Bob").lastName("Johnson").email("bob.johnson@company.com").department(FINANCE).build(),
                Employee.builder().firstName("Alice").lastName("Williams").email("alice.williams@company.com").department(MARKETING).build()
        );
    }
}
