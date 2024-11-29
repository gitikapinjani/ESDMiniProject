package com.gitikapinjani.esdminiproject.controller;

import com.gitikapinjani.esdminiproject.dto.CourseDetailsResponse;
import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.dto.SpecializationResponse;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.entity.Specialization;
import com.gitikapinjani.esdminiproject.entity.SpecializationCourse;
import com.gitikapinjani.esdminiproject.service.CourseService;
import com.gitikapinjani.esdminiproject.service.SpecializationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/specialization")
public class SpecializationController {

    @Autowired
    private SpecializationService specializationService;

    @GetMapping("/getAllSpecialization")
    public List<Specialization> getAllSpecialization() {
        return specializationService.getAllSpecialization();
    }
}
