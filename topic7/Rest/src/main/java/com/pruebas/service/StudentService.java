package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebas.dao.StudentDAO;
import com.pruebas.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public boolean addEntity(Student student) {
		return studentDAO.addEntity(student);
	}

	public Student getEntity(int id) {
		System.out.println("hello service");
		return studentDAO.getEntity(id);
	}

	public List<Student> getEntities() {
		List<Student> result = new ArrayList<Student>();
		for (Student t : studentDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}

	public boolean updateEntity(Student student) {
		return studentDAO.updateEntity(student);
	}

//	private User formatUser(StudentDTO student) {
//		return new Student(); // Cambios necesarios de UserDTO a User
//	}
//
//	private UserDTO formatUserDTO(Student student) {
//		return new UserDTO(); // Cambios necesarios de User a UserDTO
//	}
}

