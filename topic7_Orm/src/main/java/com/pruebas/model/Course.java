package com.pruebas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_table")
public class Course {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idcourse;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="assignedTeacher")
	private int assignedTeacher;
	
	@Column(name="hoursWeek")
	private int hoursByWeek;
	
	@Column(name="scheduleTime")
    private  String scheduleTime;
	
	@ManyToMany(mappedBy="courses", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Student> students ;
	
    //private ArrayList<Teachers> teacherss ;
	public Course(String name, int assignedTeacher, int hoursByWeek, String scheduleTime) {
		this.cname = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime ;
		
	}
	
	public Course() {
		//Importante
	}
	
	public void  addStudent(Student std) {
		students.add(std);
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String name) {
		this.cname = name;
	}
	public int getAssignedTeacher() {
		return assignedTeacher;
	}
	public void setAssignedTeacher(int assignedTeacher) {
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + cname + ", assignedTeacher=" + assignedTeacher + ", hoursByWeek=" + hoursByWeek + ", scheduleTime=" + scheduleTime + "]";
	}
    
    

}
