package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.dto.CourseDetailsResponse;
import com.gitikapinjani.esdminiproject.entity.Courses;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {
    Courses findCoursesByCourseCode(String courseCode);

    @Query("""
        SELECT new com.gitikapinjani.esdminiproject.dto.CourseDetailsResponse(
            c.courseId,
            c.courseCode,
            c.name,
            c.description,
            c.year,
            c.term,
            c.facultyName,
            c.credits,
            c.capacity
        )
        FROM Courses c
    """)
    List<CourseDetailsResponse> fetchCourseDetails();
}
