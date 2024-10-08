package com.CollegeManagement.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CollegeManagement.demo.Entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
	
}