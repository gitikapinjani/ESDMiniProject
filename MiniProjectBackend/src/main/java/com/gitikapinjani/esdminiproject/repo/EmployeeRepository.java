package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {
    Employees findByEmail(String email);
}
