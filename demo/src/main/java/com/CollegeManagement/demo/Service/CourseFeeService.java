package com.CollegeManagement.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagement.demo.Entity.CourseFee;
import com.CollegeManagement.demo.Repository.CourseFeeRepository;

@Service
public class CourseFeeService {

    @Autowired
    private CourseFeeRepository courseFeeRepository;
    
    public String getCourseFeeByCollegeId(Long collegeId) {
//        return courseFeeRepository.findByCollegeId(collegeId);
    	return"Optional<CourseFee>";
    }
}