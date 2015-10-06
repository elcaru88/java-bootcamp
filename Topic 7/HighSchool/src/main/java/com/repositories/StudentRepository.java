package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByRegistrationNumber(int registrationNumber);
	

}
