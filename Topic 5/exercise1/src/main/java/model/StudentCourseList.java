package model;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseList {
	
	private List<StudentCourse> studentCourseList;

	
	
	public StudentCourseList() {
		super();
		// TODO Auto-generated constructor stub
		studentCourseList = new ArrayList<StudentCourse>();
	}



	public List<StudentCourse> getStudentCourseList() {
		return studentCourseList;
	}



	public void setStudentCourseList(List<StudentCourse> studentCourseList) {
		this.studentCourseList = studentCourseList;
	}



	@Override
	public String toString() {
		return "StudentCourseList [studentCourseList=" + studentCourseList
				+ "]";
	}



	public void add(StudentCourse studentCourse) {
		// TODO Auto-generated method stub
		studentCourseList.add(studentCourse);
	}

}
