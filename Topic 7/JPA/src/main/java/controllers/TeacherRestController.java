package controllers;

import java.util.ArrayList;
import java.util.List;

import model.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import repositories.TeacherRepository;

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

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	void insertTeacher(@RequestBody Teacher teacher) {
		teacherRepository.save(teacher);
	}

}
