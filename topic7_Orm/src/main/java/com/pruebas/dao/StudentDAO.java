package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Student;

public interface StudentDAO {

	boolean addEntity(Student student);

	Student getEntity(int id);

	List<Student> getEntities();

	boolean updateEntity(Student student);

}
