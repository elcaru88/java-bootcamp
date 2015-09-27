package model;

import java.sql.SQLException;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		try {
			//System.out.println(AccionStudentCourse.getFinalNote(1));
	/*		String rn = "1";
			
			int registrationNumber = Integer.parseInt(rn);
			
			StudentCourseList studentCourseList = AccionStudentCourse.getFinalNote(registrationNumber);
			List<StudentCourse> studentNote = (List<StudentCourse>) studentCourseList.getStudentCourseList();
			for (StudentCourse student : studentNote) {
				System.out.println(student.getStudentlastName());
				System.out.println(student.getStudentfirstName());
				System.out.println(student.getCourseName());
				System.out.println(student.getFinalNote());
				
					}*/
			
		//	System.out.println(AccionStudentCourse.getCourse("History"));
			
			String courseName = "History";
			StudentCourseList studentCourseList = AccionStudentCourse.getCourse(courseName);
			
			List<StudentCourse> course = (List<StudentCourse>) studentCourseList.getStudentCourseList();
			System.out.println("Course: " + course.get(0).getCourseName() );
			System.out.println("Teacher: " + course.get(0).getTeacherLastName()+ " , "+ course.get(0).getTeacherFirstName() );
		 	
			for (StudentCourse student : course) {	
				System.out.println(student.getStudentlastName());
				System.out.println(student.getStudentfirstName());
				}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
