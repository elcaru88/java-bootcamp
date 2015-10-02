package data;

import java.util.ArrayList;

public class Course {
	private String name;
	private Teacher assignedTeacher;
	private int hoursByWeek;
    private  String scheduleTime;
    private ArrayList<Student> students ;
    private ArrayList<Teachers> teacherss ;
	public Course(String name, Teacher assignedTeacher, int hoursByWeek, String scheduleTime) {
		super();
		this.name = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime ;
		students = new ArrayList<Student>();
	}
	
	public void  addStudent(Student std) {
		students.add(std);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}
	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}
	public int getHoursByWeek() {
		return hoursByWeek;
	}
	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTimes(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", assignedTeacher=" + assignedTeacher + ", hoursByWeek=" + hoursByWeek + ", scheduleTime=" + scheduleTime + "]";
	}
    
    

}
