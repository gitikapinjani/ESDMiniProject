package com.gitikapinjani.esdminiproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gitikapinjani.esdminiproject.entity.CoursePrerequistic;
import com.gitikapinjani.esdminiproject.entity.Specialization;
import jakarta.validation.constraints.*;
import java.util.List;

public record CourseResponse(
        @NotNull(message = "courseCode should be present")
        @NotEmpty(message = "courseCode should be present")
        @NotBlank(message = "courseCode should be present")
        @JsonProperty("course_code")
        String courseCode,

        @NotNull(message = "name should be present")
        @NotEmpty(message = "name should be present")
        @NotBlank(message = "name should be present")
        @JsonProperty("name")
        String name,

        @NotNull(message = "description should be present")
        @NotEmpty(message = "description should be present")
        @NotBlank(message = "description should be present")
        @JsonProperty("description")
        String description,

        @NotNull(message = "year should be present")
        @NotEmpty(message = "year should be present")
        @NotBlank(message = "year should be present")
        @JsonProperty("year")
        String year,

        @NotNull(message = "term should be present")
        @NotEmpty(message = "term should be present")
        @NotBlank(message = "term should be present")
        @JsonProperty("term")
        String term,

        @NotNull(message = "facultyName should be present")
        @NotEmpty(message = "facultyName should be present")
        @NotBlank(message = "facultyName should be present")
        @JsonProperty("facultyName")
        String facultyName,

        @NotNull(message = "credits should be present")
        @JsonProperty("credits")
        int credits,

        @NotNull(message = "capacity should be present")
        @JsonProperty("capacity")
        int capacity,

        List<CoursePrerequistic> prerequisticCoursesIds,
        CourseScheduleRequest courseScheduleRequest,
        Specialization specialization

){
}

