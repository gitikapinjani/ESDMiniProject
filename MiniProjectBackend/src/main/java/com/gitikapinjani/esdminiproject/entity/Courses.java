package com.gitikapinjani.esdminiproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_code", nullable = false)
    private String courseCode;

    @Column(name = "name")
    private String name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Column(name="year", nullable = false)
    private String year;

    @Column(name="term", nullable = false)
    private String term;

    @Column(name="faculty_name", nullable = false)
    private String facultyName;

    @Column(name="credits", nullable = false)
    private int credits;

    @Column(name="capacity", nullable = false)
    private int capacity;
}


