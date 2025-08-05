package com.deutsche.demo.controller;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// http://localhost:8090/api/v1/swagger-ui/index.html

//@CrossOrigin(origins = "*")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:3000"})
@RestController
@RequestMapping("employees")
public class EmployeeController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        LOG.info(id.toString());
        return ResponseEntity
                .ok()
                .header("message", "Employee with the id " + id + " fetched successfully.")
                .body(employeeService.getEmployeeById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
        LOG.info(employee.getId().toString());
        return ResponseEntity
                .ok()
                .header("message", "Employee added successfully.")
                .body(employeeService.addEmployee(employee));
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        LOG.info(employee.getId().toString());
        return ResponseEntity
                .ok()
                .header("message", "Employee added successfully.")
                .body(employeeService.updateEmployee(employee));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable(name = "id") Integer id) {
        LOG.info(id.toString());
        return ResponseEntity
                .ok()
                .header("message", "Employee with the id " + id + "  deleted successfully.")
                .body(employeeService.deleteEmployee(id));
    }
}


