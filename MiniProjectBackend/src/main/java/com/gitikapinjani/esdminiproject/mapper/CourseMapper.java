package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.CoursePrerequistic;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.repo.CoursePrerequisticRepository;
import com.gitikapinjani.esdminiproject.repo.CourseRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Component
public class CourseMapper {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CoursePrerequisticRepository coursePrerequisticRepository;

    public Courses toEntity(@Valid CourseRequest request) {
        Courses courses = courseRepository.findCoursesByCourseCode(request.courseCode());
        Set<CoursePrerequistic> coursePrerequisticList = coursePrerequisticRepository.findCoursePrerequisticsByCourse(courses);
        return Courses.builder()
                .courseCode(request.courseCode())
                .name(request.name())
                .description(request.description())
                .year(request.year())
                .term(request.term())
                .facultyName(request.facultyName())
                .credits(request.credits())
                .capacity(request.capacity())
                .build();
    }
}
