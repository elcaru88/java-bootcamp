package data;

import java.util.ArrayList;

public class Students {
	ArrayList<Student> students;
	
	public Students() {
		students = new ArrayList<Student>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void setStudents(ArrayList<Student> sts) {
		students = sts;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
		
	}
	

}
