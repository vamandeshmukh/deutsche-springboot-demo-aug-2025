package com.deutsche.demo.exception;

import com.deutsche.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .header("message", e.getMessage())
                .body(null);  // ✔ Works fine

    }



}
