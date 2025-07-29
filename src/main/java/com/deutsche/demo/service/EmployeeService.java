package com.deutsche.demo.service;

import com.deutsche.demo.model.Employee;
import com.deutsche.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return empRepository.findById(id).get();
    }

    public Employee addEmployee(Employee employee) {
        return empRepository.save(employee);
    }
}


//package com.deutsche.demo.service;
//
//import com.deutsche.demo.model.Employee;
//import com.deutsche.demo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    private List<Employee> tempEmpList = new ArrayList<>(
//            Arrays.asList(
//                    new Employee(101, "Sonu", 90000.00),
//                    new Employee(101, "Sonu", 90000.00),
//                    new Employee(101, "Sonu", 90000.00)));
//
//    public List<Employee> getAllEmployees() {
//        System.out.println(tempEmpList.size());
//        return tempEmpList;
//    }
//
//    public Employee getEmployeeById(Integer id) {
//        System.out.println(id);
//        // write your logic
//        return tempEmpList.get(0);
//    }
//
//    public Employee addEmployee(Employee employee) {
//        System.out.println(employee.toString());
//        // write your logic
//        return employee;
//    }
//}
