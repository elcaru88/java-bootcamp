package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Course;
import com.model.Student;
import com.model.StudentCourse;
import com.repositories.StudentCourseRepository;
import com.repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	private final StudentRepository studentRepository;
	private final StudentCourseRepository   studentCourseRepository  ;
	
	@Autowired
	StudentRestController(StudentRepository studentRepository
		,	StudentCourseRepository studentCourseRepository ) {
		this.studentRepository = studentRepository;
		this.studentCourseRepository = studentCourseRepository;

	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> studentList() {

		List<String> list = new ArrayList<String>();
		for (Student student : studentRepository.findAll()) {
			list.add(student.toString());
		}
		return list;
	}
	
	@RequestMapping(value = "/{registrationNumber}",method = RequestMethod.GET)
	Student getStudent(@PathVariable int registrationNumber){
		return studentRepository.findByRegistrationNumber(registrationNumber);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	void insertStudent(@RequestBody  Student student) {
		studentRepository.save(student);
	}
	
	@RequestMapping(value = "/listCourses/{registrationNumber}", method = RequestMethod.GET)
	List<String> coursesList(@PathVariable int registrationNumber) {

		List<String> list = new ArrayList<String>();
			 for (StudentCourse studentCourse : studentCourseRepository.findByRegistrationNumber(registrationNumber)){
			 list.add(studentCourse.toString());
		  }
		return list;
	}
	
}
