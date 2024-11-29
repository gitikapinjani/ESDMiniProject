package com.gitikapinjani.esdminiproject.mapper;

import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.CourseSchedule;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.repo.CourseRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseScheduleMapper {

    @Autowired
    CourseRepository courseRepository;

    public CourseSchedule toEntity(@Valid CourseRequest request) {
        Courses courses = courseRepository.findCoursesByCourseCode(request.courseCode());

        return CourseSchedule.builder()
                .courses(courses)
                .time(request.courseScheduleRequest().time())
                .day(request.courseScheduleRequest().day())
                .room(request.courseScheduleRequest().room())
                .building(request.courseScheduleRequest().building())
                .build();
    }
}
