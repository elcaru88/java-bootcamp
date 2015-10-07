package com.pruebas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Course;
import com.pruebas.service.CourseService;



@RestController
@RequestMapping("/course")
public class CourseController {
	
@Autowired	
private CourseService courseService; 

//@Autowired	no usarlo dos veces
//public CourseController(CourseService courseService ) {
//	this.courseService= courseService;
//}

	
	@RequestMapping(value = "/list2",method = RequestMethod.GET)
	public ResponseEntity <ArrayList<String>> courseList() {
		ArrayList<String> list = new ArrayList<String>();
		for (Course course : courseService.getEntities()) {
			list.add(course.toString());
			
		}

		return new ResponseEntity <ArrayList<String>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public String getCourse(@PathVariable int id) {
		return courseService.getEntity(id).toString();
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public String listCourse(){
		List<Course> courses = courseService.getEntities();
		return courses.toString();
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Course> createStudent(@RequestBody Course course) {
		courseService.addEntity(course);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getStudent/{id}" , method=RequestMethod.GET )
	public String getStudents(@PathVariable int id){
		Course course = this.courseService.getEntity(id);
		return course.getStudents().toString();
		
	}
	

}
