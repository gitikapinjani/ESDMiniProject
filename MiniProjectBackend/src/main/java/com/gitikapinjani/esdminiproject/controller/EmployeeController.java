package com.gitikapinjani.esdminiproject.controller;

import com.gitikapinjani.esdminiproject.dto.EmployeeRequest;
import com.gitikapinjani.esdminiproject.entity.Employees;
import com.gitikapinjani.esdminiproject.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employees> addEmployee(@RequestBody @Valid EmployeeRequest request) {
        return ResponseEntity.ok(employeeService.addEmployee(request));
    }

}
