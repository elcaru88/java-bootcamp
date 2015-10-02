package data;

import java.util.ArrayList;

public class Teachers {
	
ArrayList<Teacher> teachers;
	
	public Teachers() {
		teachers = new ArrayList<Teacher>();
	}

	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	
	public void setTeachers(ArrayList<Teacher> ts) {
		teachers = ts;
	}
	
	public ArrayList<Teacher> getTeachers() {
		return teachers;
		
	}

}
