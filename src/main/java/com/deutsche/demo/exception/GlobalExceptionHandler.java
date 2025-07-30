package com.deutsche.demo.exception;

import com.deutsche.demo.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
        return ResponseEntity
                .notFound()
                .header("message", e.getMessage())
                .body(null);
    }



}
