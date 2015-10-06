package com;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.repositories.CourseRepository;
import com.repositories.StudentCourseRepository;
import com.repositories.StudentRepository;
import com.repositories.TeacherRepository;
import com.model.Course;
import com.model.Student;
import com.model.StudentCourse;
import com.model.Teacher;

@ImportResource(value = "databaseSource.xml")
@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		SpringApplication.run(App.class);
	}

/*
	  @Bean public CommandLineRunner student( StudentRepository studentRepository) { 
	  return (arg) -> {
	  
	  	// add a Student 
	  	 // studentRepository.save(new Student("Fer", "Cab", "1983-02-20"));
	  
	  // fetch all Student 
	    log.info("-------------------------------");
	  log.info("all Student found with findAll():"); 
	  for (Student student :  studentRepository.findAll()) {
	   log.info(student.toString()); 
	   }
	  
	  log.info("--------------------------------"); 
	  Student student = studentRepository.findByRegistrationNumber(1);
	  log.info("student found with findByRegistro(1):");
	  log.info(student.toString()); 
	  log.info("--------------------------------");
	  
	  }; }
	  
	  @Bean public CommandLineRunner teacher( TeacherRepository teacherRepository) { 
	  return (arg) -> {
	  
	  	// add a Teacher 
	  	 // teacherRepository.save(new Teacher("Carol", "Houchens", "1983-02-20"));
	  
	  // fetch all teacher 
	   log.info("-------------------------------");
	  log.info("all teacher found with findAll():"); 
	  for (Teacher teacher :  teacherRepository.findAll()) { 
	  log.info(teacher.toString()); 
	  }
	  
	  log.info("--------------------------------");
	   List<Teacher> teacher =  teacherRepository.findByFirstName("Carol");
	  log.info("teacher found with findByLastName(Carol):");
	  log.info(teacher.toString());
	  
	  log.info("--------------------------------");
	   List<Teacher> teacher2 =  teacherRepository.findByLastName("Houchens");
	  log.info("teacher found with findByLastName(Houchens):");
	  log.info(teacher2.toString());
	  log.info("--------------------------------");
	  
	  log.info("--------------------------------");
	  
	  log.info("found teacher findByLastName(Houchens) findByFirstName(Pat):");
	  for (Teacher teacher3 : teacherRepository.findByLastName("Houchens")) {
	  if (teacher3.getFirstName().equals("Pat")) 
	  log.info(teacher3.toString());
	  	  } 
	  log.info("--------------------------------");
	  
	  
	  }; }
	  
	  
	  @Bean public CommandLineRunner course( CourseRepository courseRepository){ 
	  return (arg) -> {
	  
	  // add a course
	  
	  // courseRepository.save(new Course("Mechanics","Pat","Houchens",2.30,"Monday 08:00 - 10:30"));
	  
	  // fetch all course 
	   log.info("-------------------------------");
	  log.info("all course found with findAll():"); 
	 for (Course course : courseRepository.findAll()) { 
	 log.info(course.toString()); 
	 }
	  
	  log.info("--------------------------------"); 
	  List<Course> course = courseRepository.findByName("Geography");
	  log.info("course found with findByName(Geography):");
	  log.info(course.toString());
	   log.info("--------------------------------");
	  
	  }; }
*/
	
/*	 @Bean public CommandLineRunner studentCourse( StudentCourseRepository studentCourseRepository){ 
		  return (arg) -> {
		  
		  // add a course
		  
		  // courseRepository.save(new Course("Mechanics","Pat","Houchens",2.30,"Monday 08:00 - 10:30"));
		  
		  // fetch all course 
		   log.info("-------------------------------");
		  log.info("all studentCourse found with findAll():"); 
		 for (StudentCourse studentCourse : studentCourseRepository.findAll()) { 
		 log.info(studentCourse.toString()); 
		 }
		  
		  log.info("--------------------------------"); 
		  log.info("student found with findByCourseName(Geography):");
		  for (StudentCourse studentCourse : studentCourseRepository.findByCourseName("Geography")){
			  log.info(studentCourse.toString());
		  }
		  log.info("--------------------------------");
		  
		  log.info("course found with findByRegistrationNumber(1):");
		  for (StudentCourse studentCourse2 : studentCourseRepository.findByRegistrationNumber(1)){
			  log.info(studentCourse2.toString());
		  }
		   log.info("--------------------------------");
	
		  }; }
*/
}
