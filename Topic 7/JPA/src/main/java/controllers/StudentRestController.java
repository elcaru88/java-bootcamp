package controllers;

import java.util.ArrayList;
import java.util.List;

import model.Course;
import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import repositories.StudentCourseRepository;
import repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	private final StudentRepository studentRepository;
	private final StudentCourseRepository   studentCourseRepository  ;
	
	@Autowired
	StudentRestController(StudentRepository studentRepository,
			StudentCourseRepository studentCourseRepository ) {
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

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	void insertStudent(@RequestBody  Student student) {
		studentRepository.save(student);
	}
	
	@RequestMapping(value = "/listCourses/{registrationNumber}", method = RequestMethod.GET)
	List<String> coursesList(@PathVariable int registrationNumber) {

		List<String> list = new ArrayList<String>();
		for (Course course : studentCourseRepository.findByStudentRegistrationNumber(registrationNumber)) {
			list.add(course.toString());

		}

		return list;
	}
}
