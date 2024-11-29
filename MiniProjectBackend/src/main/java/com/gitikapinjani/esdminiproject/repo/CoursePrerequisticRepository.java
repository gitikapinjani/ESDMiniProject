package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.CoursePrerequistic;
import com.gitikapinjani.esdminiproject.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CoursePrerequisticRepository extends JpaRepository<CoursePrerequistic, Long> {
    Set<CoursePrerequistic> findCoursePrerequisticsByCourse(Courses courses);
}
