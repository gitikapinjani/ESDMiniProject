package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.EmployeeRequest;
import com.gitikapinjani.esdminiproject.entity.Employees;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {

    public Employees toEntity(EmployeeRequest request) {
        return Employees.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .title(request.title())
                .department(request.department())
                .build();
    }

}
