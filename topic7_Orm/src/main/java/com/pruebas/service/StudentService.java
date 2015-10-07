package com.pruebas.service;

import java.util.List;

import com.pruebas.model.Student;

public interface StudentService {
	
	public boolean addEntity(Student student);

	public Student getEntity(int id);

	public List<Student> getEntities();

	public boolean updateEntity(Student student);

}
