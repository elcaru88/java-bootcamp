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
import com.model.StudentCourse;
import com.repositories.CourseRepository;
import com.repositories.StudentCourseRepository;


@RestController
@RequestMapping("/course")
public class CourseRestController {

	private final CourseRepository courseRepository;
	private final StudentCourseRepository   studentCourseRepository  ;
	
	@Autowired
	CourseRestController(CourseRepository courseRepository
		,	StudentCourseRepository   studentCourseRepository  ) {
		this.courseRepository = courseRepository;
		this.studentCourseRepository = studentCourseRepository;

	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> courseList() {

		List<String> list = new ArrayList<String>();
		for (Course course : courseRepository.findAll()) {
			list.add(course.toString());

		}

		return list;
	}

	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	void insertCourse(@RequestBody  Course course) {
		courseRepository.save(course);
	}
	
	@RequestMapping(value = "/{courseName}", method = RequestMethod.GET)
	List<String> coursesList(@PathVariable String courseName) {

		List<String> list = new ArrayList<String>();
		 for (StudentCourse studentCourse : studentCourseRepository.findByCourseName(courseName)){
			  list.add(studentCourse.toString());
		  }
		return list;
	}
	
	
}
