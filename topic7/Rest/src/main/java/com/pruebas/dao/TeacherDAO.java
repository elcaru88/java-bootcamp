package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Teacher;


public interface TeacherDAO {
	
	public boolean addEntity(Teacher Teacher);

	public Teacher getEntity(int id);

	public List<Teacher> getEntities();

	public boolean updateEntity(Teacher Teacher);

}
