package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScheduleRepository extends JpaRepository<CourseSchedule, Long> {
}
