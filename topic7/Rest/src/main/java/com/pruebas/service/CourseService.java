package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.CourseDAO;
import com.pruebas.daoImp.CourseDAOImp;
import com.pruebas.model.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDAO courseDAO;
	
	public boolean addEntity(Course course) {
		return courseDAO.addEntity(course);
	}

	public Course getEntity(int id) {
		System.out.println("hello service");
		return courseDAO.getEntity(id);
	}

	public List<Course> getEntities() {
		List<Course> result = new ArrayList<Course>();
		for (Course t : courseDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}

	public boolean updateEntity(Course course) {
		return courseDAO.updateEntity(course);
	}

//	private User formatUser(CourseDTO course) {
//		return new Student(); // Cambios necesarios de UserDTO a User
//	}
//
//	private UserDTO formatUserDTO(Course courseDTO) {
//		return new UserDTO(); // Cambios necesarios de User a UserDTO
//	}	

}
