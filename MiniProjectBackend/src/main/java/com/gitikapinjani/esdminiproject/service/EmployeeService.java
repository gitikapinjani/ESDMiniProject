package com.gitikapinjani.esdminiproject.service;

import com.gitikapinjani.esdminiproject.dto.EmployeeRequest;
import com.gitikapinjani.esdminiproject.dto.LoginRequest;
import com.gitikapinjani.esdminiproject.dto.LoginResponse;
import com.gitikapinjani.esdminiproject.entity.Employees;
import com.gitikapinjani.esdminiproject.entity.Login;
import com.gitikapinjani.esdminiproject.helper.EncryptionService;
import com.gitikapinjani.esdminiproject.mapper.EmployeeMapper;
import com.gitikapinjani.esdminiproject.mapper.LoginMapper;
import com.gitikapinjani.esdminiproject.repo.EmployeeRepository;
import com.gitikapinjani.esdminiproject.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private EncryptionService encryptionService;

    public Employees addEmployee(EmployeeRequest request) {

        Employees employees = employeeMapper.toEntity(request);
        employeeRepository.save(employees);

        LoginResponse loginResponse = new LoginResponse(employees, request.password());
        Login loginUser = loginMapper.toEntity(loginResponse);
        loginUser.setPassword(encryptionService.encode(loginUser.getPassword()));
        loginRepository.save(loginUser);

        return employees;
    }

}
