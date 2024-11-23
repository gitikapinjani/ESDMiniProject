package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.LoginResponse;
import com.gitikapinjani.esdminiproject.entity.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginMapper {
    public Login toEntity(LoginResponse response) {
        return Login.builder()
                .employees(response.employees())
                .password(response.password())
                .build();
    }
}

