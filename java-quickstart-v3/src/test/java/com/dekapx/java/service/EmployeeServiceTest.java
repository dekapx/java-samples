package com.dekapx.java.service;

import com.dekapx.java.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static com.dekapx.java.model.Department.IT;
import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeServiceTest {
    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        this.employeeService = new EmployeeService();
    }

    @Test
    public void shouldReturnEmployeeForGivenId() {
        var employee = this.employeeService.findById(1L);
        assertThat(employee)
                .isNotNull()
                .satisfies(e -> {
                    assertThat(e.getId()).isEqualTo(1L);
                    assertThat(e.getFirstName()).isEqualTo("John");
                    assertThat(e.getLastName()).isEqualTo("Doe");
                    assertThat(e.getEmail()).isEqualTo("John.Doe@hotmail.com");
                    assertThat(e.getDepartment()).isEqualTo(IT);
                    assertThat(e.getAddress().getAddressLine1()).isEqualTo("1830");
                    assertThat(e.getAddress().getAddressLine2()).isEqualTo("Gateway Drive");
                    assertThat(e.getAddress().getCity()).isEqualTo("San Mateo");
                    assertThat(e.getAddress().getState()).isEqualTo("CA");
                    assertThat(e.getAddress().getZipCode()).isEqualTo("94403");
                });
    }

    @Test
    public void shouldReturnAllEmployees1() {
        var employees = this.employeeService.findAll();
        assertThat(employees)
                .isNotNull()
                .hasSize(2)
                .anySatisfy(e -> {
                    assertThat(e.getId()).isEqualTo(1L);
                    assertThat(e.getFirstName()).isEqualTo("John");
                    assertThat(e.getLastName()).isEqualTo("Doe");
                    assertThat(e.getEmail()).isEqualTo("John.Doe@hotmail.com");
                    assertThat(e.getDepartment()).isEqualTo(IT);
                    assertThat(e.getAddress().getAddressLine1()).isEqualTo("1830");
                    assertThat(e.getAddress().getAddressLine2()).isEqualTo("Gateway Drive");
                    assertThat(e.getAddress().getCity()).isEqualTo("San Mateo");
                    assertThat(e.getAddress().getState()).isEqualTo("CA");
                    assertThat(e.getAddress().getZipCode()).isEqualTo("94403");
                });
    }

    @Test
    public void shouldReturnAllEmployees2() {
        var employees = this.employeeService.findAll();
        assertThat(employees)
                .isNotNull()
                .hasSize(2)
                .allSatisfy(e -> {
                    assertThat(e.getId()).isIn(1L, 2L);
                    assertThat(e.getFirstName()).isIn("John", "Jane");
                    assertThat(e.getLastName()).isIn("Doe", "Doe");
                    assertThat(e.getEmail()).isIn("John.Doe@hotmail.com", "Jane.Doe@gmail.com");
                    assertThat(e.getDepartment()).isEqualTo(IT);
                    assertThat(e.getAddress().getAddressLine1()).isIn("1830", "2121");
                    assertThat(e.getAddress().getAddressLine2()).isIn("Gateway Drive", "El Camino Real");
                    assertThat(e.getAddress().getCity()).isEqualTo("San Mateo");
                    assertThat(e.getAddress().getState()).isEqualTo("CA");
                    assertThat(e.getAddress().getZipCode()).isIn("94403", "94404");
                });
    }
}
