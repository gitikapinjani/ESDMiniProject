package com.gitikapinjani.esdminiproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name="title", nullable = false)
    private String title;

    //need to change
//    @Column(name="photograph_path", nullable = false)
//    private String photographPath;

    @Column(name="department", nullable = false)
    private String department;
}

