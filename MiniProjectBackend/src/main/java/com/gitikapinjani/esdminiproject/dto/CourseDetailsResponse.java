package com.gitikapinjani.esdminiproject.dto;

import lombok.Data;

@Data
public class CourseDetailsResponse {
    private Long courseId;
    private String courseCode;
    private String name;
    private String description;
    private String year;
    private String term;
    private String facultyName;
    private int credits;
    private int capacity;

    public CourseDetailsResponse(Long courseId, String courseCode, String name, String description,
                                 String year, String term, String facultyName, int credits, int capacity) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.name = name;
        this.description = description;
        this.year = year;
        this.term = term;
        this.facultyName = facultyName;
        this.credits = credits;
        this.capacity = capacity;
    }

}
