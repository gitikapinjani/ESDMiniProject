package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.CoursePrerequistic;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.repo.CourseRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursePrerequisticMapper {

    @Autowired
    CourseRepository courseRepository;

    public List<CoursePrerequistic> toEntity(@Valid CourseRequest request) {
        Courses courses = courseRepository.findCoursesByCourseCode(request.courseCode());

        List<Courses> coursePrerequisticList = courseRepository.findAllById(request.prerequisiteCoursesIds());

        return coursePrerequisticList.stream()
                .map(prerequisite -> CoursePrerequistic.builder()
                        .course(courses)
                        .prerequisite(prerequisite)
                        .build())
                .collect(Collectors.toList());
    }
}
