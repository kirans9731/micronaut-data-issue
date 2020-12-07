package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class EmployeeRepositoryTest {

    @Inject
    EmployeeRepository employeeRepository;

    @Test
    public void test_GetEmployees() {
        employeeRepository.getEmployees();
    }
}
