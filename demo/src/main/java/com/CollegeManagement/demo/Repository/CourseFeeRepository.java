package com.CollegeManagement.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CollegeManagement.demo.Entity.CourseFee;

@Repository
public interface CourseFeeRepository extends JpaRepository<CourseFee, Long> {
}
