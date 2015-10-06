package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, String> {

	List<Teacher> findByLastName(String lastName);
	
	List<Teacher> findByFirstName(String firstName);
	
	
}
