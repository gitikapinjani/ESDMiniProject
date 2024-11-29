package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.entity.Specialization;
import com.gitikapinjani.esdminiproject.entity.SpecializationCourse;
import com.gitikapinjani.esdminiproject.repo.CourseRepository;
import com.gitikapinjani.esdminiproject.repo.SpecializationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecializationCourseMapper {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    SpecializationRepository specializationRepository;

    public SpecializationCourse toEntity(@Valid CourseRequest request) {
        Courses courses = courseRepository.findCoursesByCourseCode(request.courseCode());
        Specialization specialization = specializationRepository.findSpecializationBySpecializationId(request.specializationId());

        return SpecializationCourse.builder()
                .courses(courses)
                .specialization(specialization)
                .build();
    }


}
