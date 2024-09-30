package com.CollegeManagement.demo.Entity;
import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "duration_of_course")
    private String durationOfCourse;

    @Column(name = "accommodation_type")
    private String accommodationType;

    @Column(name = "accommodation_fee")
    private BigDecimal accommodationFee;

    @OneToOne(mappedBy = "college", cascade = CascadeType.ALL)
    private CourseFee courseFee;

    
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCourseName() {
		return courseName;
	}




	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}




	public String getDurationOfCourse() {
		return durationOfCourse;
	}




	public void setDurationOfCourse(String durationOfCourse) {
		this.durationOfCourse = durationOfCourse;
	}




	public String getAccommodationType() {
		return accommodationType;
	}




	public void setAccommodationType(String accommodationType) {
		this.accommodationType = accommodationType;
	}




	public BigDecimal getAccommodationFee() {
		return accommodationFee;
	}




	public void setAccommodationFee(BigDecimal accommodationFee) {
		this.accommodationFee = accommodationFee;
	}




	public CourseFee getCourseFee() {
		return courseFee;
	}




	public void setCourseFee(CourseFee courseFee) {
		this.courseFee = courseFee;
	}




	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", courseName=" + courseName + ", durationOfCourse="
				+ durationOfCourse + ", accommodationType=" + accommodationType + ", accommodationFee="
				+ accommodationFee + ", courseFee=" + courseFee + "]";
	}

    
}

