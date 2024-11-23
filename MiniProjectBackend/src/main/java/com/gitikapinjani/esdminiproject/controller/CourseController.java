package com.gitikapinjani.esdminiproject.controller;

import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.service.CourseService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    // final : it will create only one object in whole project container, when we run the project
//    private final CourseService courseService;

//    @PostMapping("/add")// for post request
//    public ResponseEntity<Courses> addCourse(@RequestBody @Valid ProductRequest request) {
//        return ResponseEntity.ok(productService.addProduct(request));
//    }
}