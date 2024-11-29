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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course", referencedColumnName = "course_id")
    private Courses course;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prerequisite", referencedColumnName = "course_id")
    private Courses prerequisite;
}