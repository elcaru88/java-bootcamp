package entities;

import java.util.ArrayList;

public class Course {
	
	 private String name;
	 private Teacher assignedTeacher;
	 private int hoursByWeek;
	 private  ArrayList<ScheduleTime> schedule;
	 private ArrayList<Student> students ;
	
	 public Course(String name, Teacher assignedTeacher, int hoursByWeek) {
		this.name = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;
		this.students = new ArrayList<Student>();
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ScheduleTime> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<ScheduleTime> schedule) {
		this.schedule = schedule;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
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

	@Override
	public String toString() {
		return "Course [name=" + name + ", assignedTeacher=" + assignedTeacher
				+ ", hoursByWeek=" + hoursByWeek + ", schedule=" + schedule
				+ "]";
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public String getInfo() {
		
		String text = "Course: "+ name + "\nTeacher: "+ assignedTeacher.getFirstName()+", "+ assignedTeacher.getLastName()+ "\nStudents:  \n";
		
		if (students.isEmpty()) {
			System.out.println("no hay estudiantes");
		}else
		{   
			for (Student stu : this.students) {
			text = text + " "+ stu.toString()+"\n" ;
			}
		}
		return text;
	}
	 
}
