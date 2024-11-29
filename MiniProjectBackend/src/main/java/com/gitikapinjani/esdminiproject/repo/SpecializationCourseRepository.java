package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.SpecializationCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationCourseRepository extends JpaRepository<SpecializationCourse, Long> {
}
