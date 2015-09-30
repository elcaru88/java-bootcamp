package repositories;


import java.util.List;

import model.Course;
import model.Student;
import model.StudentCourse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository  extends JpaRepository<StudentCourse, String>{
	
	List<Course>	 findByStudentRegistrationNumber (int registrationNumber );
	
	List<Student> findByCourseCourseName(String courseName);

}
