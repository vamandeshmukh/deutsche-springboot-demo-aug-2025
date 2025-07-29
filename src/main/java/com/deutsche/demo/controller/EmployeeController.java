package com.deutsche.demo.controller;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

//    private EmployeeService empService = new EmployeeService();

    @Autowired
    private EmployeeService empService;

    @GetMapping("emp")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("emp")
public Employee getEmployeeById(Integer id) {
    return empService.getEmployeeById(id);
}


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
