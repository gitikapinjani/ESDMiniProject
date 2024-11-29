package com.gitikapinjani.esdminiproject.service;


import com.gitikapinjani.esdminiproject.entity.Specialization;
import com.gitikapinjani.esdminiproject.repo.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {

    @Autowired
    private SpecializationRepository specializationRepository;
    public List<Specialization> getAllSpecialization() {
        return specializationRepository.findAll();
    }

}
