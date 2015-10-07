package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.GenericDAO;
import com.pruebas.dao.StudentDAO;
import com.pruebas.model.Student;

@Service
public class StudentServiceImp implements StudentService{

@Autowired
StudentDAO studentDAO;

	
	public boolean addEntity(Student student) {
		return studentDAO.addEntity(student);
	}
	
	public Student getEntity(int id) {
		return studentDAO.getEntity(id);
	}
	
	public List<Student> getEntities() {
		List <Student> list = studentDAO.getEntities();
		return list;
	}

	public boolean updateEntity(Student student) {
		return studentDAO.updateEntity(student);
	}

//	private User formatUser(CourseDTO course) {
//		return new Student(); // Cambios necesarios de UserDTO a User
//	}
//
//	private UserDTO formatUserDTO(Course courseDTO) {
//		return new UserDTO(); // Cambios necesarios de User a UserDTO
//	}	

}
