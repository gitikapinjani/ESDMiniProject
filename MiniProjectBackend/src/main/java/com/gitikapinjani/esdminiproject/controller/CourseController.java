package com.gitikapinjani.esdminiproject.controller;

import com.gitikapinjani.esdminiproject.dto.CourseDetailsResponse;
import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.service.CourseService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public ResponseEntity<Courses> addCourse(@RequestBody @Valid CourseRequest request) {
        return ResponseEntity.ok(courseService.addCourse(request));
    }

    @GetMapping("/getAllCourses")
    public List<CourseDetailsResponse> getAllCourses() {
        return courseService.getAllCourses();
    }
}