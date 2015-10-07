package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.CourseDAO;
import com.pruebas.dao.GenericDAO;
import com.pruebas.dao.imp.CourseDAOImp;
import com.pruebas.model.Course;
import com.pruebas.model.Teacher;

@Service
public class CourseService {
	
@Autowired	
CourseDAO courseDAO;
	
	
	public boolean addEntity(Course course) {
		return courseDAO.addEntity(course);
	}
	
	public Course getEntity(int id) {
		return courseDAO.getEntity(id);
	}
	
	public ArrayList<Course> getEntities() {
		ArrayList<Course> result = new ArrayList<Course>();
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
