package com.deutsche.demo.controller;

import com.deutsche.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    // empList

    @GetMapping("emp")
    public List<Employee> getAllEmployees() {
        return null;
    }

//    @GetMapping("emp")
//    public Object getEmployeeById() {
//        Integer id = 101;
//        return null;
//    }

//    public Object addEmployee() {
//        return null;
//    }
//
//    public Object updateEmployee() {
//        return null;
//    }
//
//    public Object deleteEmployee() {
//        return null;
//    }

}
