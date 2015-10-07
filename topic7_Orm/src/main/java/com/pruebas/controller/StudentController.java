package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Student;
import com.pruebas.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired	
	private StudentService studentService;
	
	
	
	@RequestMapping(value = "/get2/{id}", method = RequestMethod.GET)
	public Student getUser2(@PathVariable int id) {
		return studentService.getEntity(id);
		//return new ResponseEntity<Student>(studentService.getEntity(id), HttpStatus.OK);
		//new ResponseEntity<StudentDTO>(studentService.getEntity(Integer.valueOf(id)), HttpStatus.OK);
			
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	 public String getStudent(@PathVariable int id) {
	  System.out.println("Buscando usuario");
	  return studentService.getEntity(id).toString();
	 }
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public String listStudents(){
		List<Student> students = studentService.getEntities();
		return students.toString();
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		studentService.addEntity(student);//esta bien
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
      
	
	@RequestMapping(value = "/getCourse/{id}" , method=RequestMethod.GET )
	public String getCourses(@PathVariable int id){
		Student student = this.studentService.getEntity(id);
		return student.getCourses().toString();
		
	}
	 

}
