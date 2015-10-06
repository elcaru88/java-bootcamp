package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, String> {

	List<StudentCourse> findByRegistrationNumber(int registrationNumber);
	
	List<StudentCourse> findByCourseName(String courseName);

}
