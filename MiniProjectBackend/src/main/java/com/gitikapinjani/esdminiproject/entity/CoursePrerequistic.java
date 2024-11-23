package com.gitikapinjani.esdminiproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_prerequistic")
public class CoursePrerequistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Courses courses;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prerequistic_course_id", referencedColumnName = "course_id")
    private Courses prerequisticCourses;

}