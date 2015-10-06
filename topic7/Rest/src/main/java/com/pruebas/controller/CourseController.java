package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Course;
import com.pruebas.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	CourseService courseService;
	
	@Autowired
	public CourseController (CourseService courseService) {
	this.courseService = courseService;
	}	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getCourse(@PathVariable int id) {
		System.out.println("Buscando Curso");
		return courseService.getEntity(id).toString();
		// anda pero devuelve string
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public String listCourse(){
		List<Course> courses = courseService.getEntities();
		return courses.toString();
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	 public void createStudent(
	   @RequestParam(value="assignedTeacher", required = true) int assignedTeacher,
	   @RequestParam(value="name" , required = true) String name,
	   @RequestParam(value="hoursperweek" , required = true) int hourseperweek) {
        this.courseService.addEntity(new Course(assignedTeacher, name , hourseperweek));
	 }
	
	@RequestMapping(value = "/getStudents/{id}" , method=RequestMethod.GET )
	public String getStudents(@PathVariable int id){
		Course course = this.courseService.getEntity(id);
		return course.getStudents().toString();
		
	}
	
	

}
