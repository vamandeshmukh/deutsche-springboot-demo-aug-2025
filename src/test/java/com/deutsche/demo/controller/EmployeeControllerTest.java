//package com.deutsche.demo.controller;
//
//import com.deutsche.demo.model.Employee;
//import com.deutsche.demo.service.EmployeeService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(EmployeeController.class)
//@Import(EmployeeControllerTestConfig.class)
//public class EmployeeControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private EmployeeService employeeService;
//
//    @Test
//    void testGetAllEmployees() throws Exception {
//
//        Employee e1 = new Employee(1, "Vaman", 50000.0);
//        Employee e2 = new Employee(2, "Shridhar", 60000.0);
//
//        when(employeeService.getAllEmployees()).thenReturn(List.of(e1, e2));
//
//        mockMvc.perform(get("/employees"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.length()").value(2))
//                .andExpect(jsonPath("$[0].id").value(1))
//                .andExpect(jsonPath("$[0].name").value("Vaman"))
//                .andExpect(jsonPath("$[0].salary").value(50000.0))
//                .andExpect(jsonPath("$[1].id").value(2))
//                .andExpect(jsonPath("$[1].name").value("Shridhar"))
//                .andExpect(jsonPath("$[1].salary").value(60000.0));
//    }
//}
