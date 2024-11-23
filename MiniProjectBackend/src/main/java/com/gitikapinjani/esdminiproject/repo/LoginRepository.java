package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.Employees;
import com.gitikapinjani.esdminiproject.entity.Login;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    Optional<Login> findByEmployees(Employees employees);
}