package com.deutsche.demo.controller;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

//    private EmployeeService empService = new EmployeeService();

    @Autowired
    private EmployeeService empService;

    //    http://localhost:8080/api/emp
    @GetMapping("emp")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    //    http://localhost:8080/api/emp/101
    @GetMapping("emp/{id}")
    public Employee getEmployeeById(@PathVariable( name = "id") Integer id) {
        return empService.getEmployeeById(id);
    }

    //    http://localhost:8080/api/emp/101
    @PostMapping("emp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.addEmployee(employee);
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
