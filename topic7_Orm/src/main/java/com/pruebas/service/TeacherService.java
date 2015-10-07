package com.pruebas.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.dao.GenericDAO;
import com.pruebas.dao.TeacherDAO;
import com.pruebas.model.Teacher;

@Service
public class TeacherService {
	@Autowired
	TeacherDAO teacherDAO;
	
	
	public boolean addEntity(Teacher teacher) {
		return teacherDAO.addEntity(teacher);
	}
	
	public Teacher getEntity(int id) {
		return teacherDAO.getEntity(id);
	}
	
	public ArrayList<Teacher> getEntities() {
		ArrayList<Teacher> result = new ArrayList<Teacher>();
		for (Teacher t : teacherDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}

	public boolean updateEntity(Teacher teacher) {
		return teacherDAO.updateEntity(teacher);
	}

//	private User formatUser(Teacher teacher) {
//		return new User(); // Cambios necesarios de UserDTO a User
//	}
//
//	private UserDTO formatUserDTO(Teacher teacher) {
//		return new UserDTO(); // Cambios necesarios de User a UserDTO
//	}

}
