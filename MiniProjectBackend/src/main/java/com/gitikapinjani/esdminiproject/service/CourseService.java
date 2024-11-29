package com.gitikapinjani.esdminiproject.service;

import com.gitikapinjani.esdminiproject.dto.CourseDetailsResponse;
import com.gitikapinjani.esdminiproject.dto.CourseRequest;
import com.gitikapinjani.esdminiproject.entity.CoursePrerequistic;
import com.gitikapinjani.esdminiproject.entity.CourseSchedule;
import com.gitikapinjani.esdminiproject.entity.Courses;
import com.gitikapinjani.esdminiproject.entity.SpecializationCourse;
import com.gitikapinjani.esdminiproject.exceptions.CourseNotFoundException;
import com.gitikapinjani.esdminiproject.exceptions.DatabaseOperationException;
import com.gitikapinjani.esdminiproject.mapper.CourseMapper;
import com.gitikapinjani.esdminiproject.mapper.CoursePrerequisticMapper;
import com.gitikapinjani.esdminiproject.mapper.CourseScheduleMapper;
import com.gitikapinjani.esdminiproject.mapper.SpecializationCourseMapper;
import com.gitikapinjani.esdminiproject.repo.CoursePrerequisticRepository;
import com.gitikapinjani.esdminiproject.repo.CourseRepository;
import com.gitikapinjani.esdminiproject.repo.CourseScheduleRepository;
import com.gitikapinjani.esdminiproject.repo.SpecializationCourseRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    private CoursePrerequisticMapper coursePrerequisticMapper;

    @Autowired
    private CourseScheduleMapper courseScheduleMapper;

    @Autowired
    private SpecializationCourseMapper specializationCourseMapper;

    @Autowired
    private CoursePrerequisticRepository coursePrerequisticRepository;

    @Autowired
    private SpecializationCourseRepository specializationCourseRepository;

    @Autowired
    private CourseScheduleRepository courseScheduleRepository;

    public Courses addCourse(@Valid CourseRequest request) {
        try {
            Courses courses = courseMapper.toEntity(request);

            List<CoursePrerequistic> coursePrerequistic = coursePrerequisticMapper.toEntity(request);

            CourseSchedule courseSchedule = courseScheduleMapper.toEntity(request);

            SpecializationCourse specializationCourse = specializationCourseMapper.toEntity(request);

            courseRepository.save(courses);
            coursePrerequisticRepository.saveAll(coursePrerequistic);
            courseScheduleRepository.save(courseSchedule);
            specializationCourseRepository.save(specializationCourse);

            return courses;
        } catch (Exception e) {
            throw new DatabaseOperationException("Failed to save the course and related data", e);
        }
    }

    public List<CourseDetailsResponse> getAllCourses() {
        List<CourseDetailsResponse> courses = courseRepository.fetchCourseDetails();
        if (courses.isEmpty()) {
            throw new CourseNotFoundException("No courses found in the database.");
        }
        return courses;
    }
}
