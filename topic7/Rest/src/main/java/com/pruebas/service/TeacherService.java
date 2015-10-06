package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebas.daoImp.TeacherDAOImp;
import com.pruebas.model.Teacher;

@Service
public class TeacherService {
	
	TeacherDAOImp teacherDAO;
	
	public boolean addEntity(Teacher teacher) {
		return teacherDAO.addEntity(teacher);
	}

	public Teacher getEntity(int id) {
		return teacherDAO.getEntity(id);
	}

	public List<Teacher> getEntities() {
		List<Teacher> result = new ArrayList<Teacher>();
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
