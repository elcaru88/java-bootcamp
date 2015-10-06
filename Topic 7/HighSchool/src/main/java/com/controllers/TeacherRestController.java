package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.model.Teacher;
import com.repositories.TeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {

	private final TeacherRepository teacherRepository;

	@Autowired
	TeacherRestController(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> teacherList() {

		List<String> list = new ArrayList<String>();
		for (Teacher teacher : teacherRepository.findAll()) {
			list.add(teacher.toString());
		}
		return list;
	}

	@RequestMapping(value = "/search",method = RequestMethod.GET)
	Teacher getTeacher(
			@RequestParam(value = "firstName", required = true) String firstName,
			@RequestParam(value = "lastName", required = true) String lastName) {

		for (Teacher teacher : teacherRepository.findByLastName(lastName)) {
			if (teacher.getFirstName().equals(firstName))
				return teacher;
		}
		return null;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	void insertTeacher(@RequestBody Teacher teacher) {
		teacherRepository.save(teacher);
	}

}
