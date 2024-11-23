package com.gitikapinjani.esdminiproject.service;

import java.util.Optional;

import com.gitikapinjani.esdminiproject.dto.LoginRequest;
import com.gitikapinjani.esdminiproject.entity.Employees;
import com.gitikapinjani.esdminiproject.entity.Login;
import com.gitikapinjani.esdminiproject.helper.CustomUserDetails;
import com.gitikapinjani.esdminiproject.helper.EncryptionService;
import com.gitikapinjani.esdminiproject.helper.JWTHelper;
import com.gitikapinjani.esdminiproject.repo.EmployeeRepository;
import com.gitikapinjani.esdminiproject.repo.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private EncryptionService encryptionService;

    @Autowired
    private JWTHelper jwtHelper;

    public String loginUser(LoginRequest request) {
        Employees existingEmployee = employeeRepository.findByEmail(request.email());
        Optional<Login> existingUser = loginRepository.findByEmployees(existingEmployee);

        if (existingUser.isPresent()) {
            if(!encryptionService.validates(request.password(), existingUser.get().getPassword())) {
                return "Wrong Password or Email";
            }
            else {
                return jwtHelper.generateToken(request.email());
            }
        } else {
            return "User not found";
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employees existingEmployee = employeeRepository.findByEmail(username);
        Login login = loginRepository.findByEmployees(existingEmployee)
                .orElseThrow(() -> new UsernameNotFoundException("Customer not found with email: " + username));
        return new CustomUserDetails(login); // Wrapping Customer in CustomUserDetails
    }
}
