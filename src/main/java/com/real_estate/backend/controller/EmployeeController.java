package com.real_estate.backend.controller;

import com.real_estate.backend.entity.EmployeeEntity;
import com.real_estate.backend.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

//    @PostMapping("/employees/")
//    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity) {
//        employeeService.createEmployee();
//    }
}
