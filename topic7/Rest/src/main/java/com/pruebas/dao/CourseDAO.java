package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Course;

public interface CourseDAO {
	
	public boolean addEntity(Course course);

	public Course getEntity(int id);

	public List<Course> getEntities();

	public boolean updateEntity(Course course);

}
