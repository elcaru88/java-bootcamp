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

import com.pruebas.model.Teacher;
import com.pruebas.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

@Autowired
private TeacherService teacherService;



//	@Autowired
//	public TeacherController(TeacherDAOImp teacherDAOImp) {
//		this.teacherDAOImp = teacherDAOImp;
//
//	}

	@RequestMapping(value = "/list2/{id}", method = RequestMethod.GET)
	public ArrayList<String> teacherList() {
		ArrayList<String> list = new ArrayList<String>();
		for (Teacher teacher : teacherService.getEntities()) {
			list.add(teacher.toString());

		}

		return list;
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	 public String getTeacher(@PathVariable int id) {
	  return teacherService.getEntity(id).toString();
	 }
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public String listTeachers(){
		List<Teacher> Teachers = teacherService.getEntities();
		return Teachers.toString();
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Teacher> createStudent(@RequestBody Teacher teacher) {
		teacherService.addEntity(teacher);
		return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
	}

}
