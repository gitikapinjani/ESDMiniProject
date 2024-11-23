package com.gitikapinjani.esdminiproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialization")
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "specialization_id")
    private Long specializationId;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Column(name="year", nullable = false)
    private String year;

    @Column(name="credits_required", nullable = false)
    private String creditsRequired;
}