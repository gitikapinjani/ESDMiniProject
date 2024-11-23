package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.Employees;
import com.gitikapinjani.esdminiproject.entity.Login;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

    //Employee login(String email, String password);
    //Employee login(@Param("email") String email, @Param("password") String password);
//    @Query("SELECT e FROM Employee e WHERE e.email = :email AND e.password = :password")
//    Employee login(@Param("email") String email, @Param("password") String password);
    Optional<Login> findByEmployees(Employees employees);
}