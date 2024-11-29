package com.gitikapinjani.esdminiproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_schedule")
public class CourseSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Courses courses;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "day", nullable = false)
    private String day;

    @Column(name = "room", nullable = false)
    private String room;

    @Column(name = "building", nullable = false)
    private String building;
}



