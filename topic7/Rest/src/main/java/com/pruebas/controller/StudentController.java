package com.pruebas.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Student;
import com.pruebas.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	StudentService studentService;

	@Autowired
	public StudentController (StudentService studentService) {
	this.studentService = studentService;
	}	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getStudent(@PathVariable int id) {
		System.out.println("Buscando usuario");
		return studentService.getEntity(id).toString();
		// Anda pero devuelve string
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	 public void createStudent(
	   @RequestParam(value="firstName", required = true) String firstName,
	   @RequestParam(value="lastName" , required = true) String lastName,
	   @RequestParam(value="birthday" , required = true) String birthday) {
         this.studentService.addEntity(new Student(firstName, lastName ,Date.valueOf(birthday)));
	 }
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public String listStudents(){
		List<Student> students = studentService.getEntities();
		return students.toString();
	 }
	
	@RequestMapping(value = "/getCourses/{id}" , method=RequestMethod.GET )
	public String getCourses(@PathVariable int id){
		Student student = this.studentService.getEntity(id);
		return student.getCourses().toString();
		
	}
	
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	 public List<Student> listStudents(){
//		List<Student> students = studentService.getEntities();
//		return students;
//		
//	 }
	
}
