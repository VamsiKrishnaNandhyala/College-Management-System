package com.CollegeManagement.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagement.demo.Entity.College;
import com.CollegeManagement.demo.Repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;
    
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }
    
    public Optional<College> getCollegeById(Long id) {
        return collegeRepository.findById(id);
    }
}

