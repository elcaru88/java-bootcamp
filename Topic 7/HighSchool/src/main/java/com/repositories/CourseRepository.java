package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

	List<Course> findByName(String name);

}
