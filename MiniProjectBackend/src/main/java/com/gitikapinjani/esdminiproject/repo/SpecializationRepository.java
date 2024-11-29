package com.gitikapinjani.esdminiproject.repo;

import com.gitikapinjani.esdminiproject.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    Specialization findSpecializationBySpecializationId(Long specializationId);
    List<Specialization> findAll();
}
