package com.deutsche.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    void testGetAllEmployees() {
        assertFalse(employeeService.getAllEmployees().isEmpty(), "Employee list should not be empty");
    }
}