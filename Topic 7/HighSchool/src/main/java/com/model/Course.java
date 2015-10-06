package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;

import com.model.classId.CourseId;
import com.model.classId.TeacherId;

@Entity
@IdClass(CourseId.class)
public class Course implements Serializable{

	@Id
	private String name;

	
	private String teacherFirstName,teacherLastName;

	 
	private double hoursByWeek;
	 
	 @Id
	private String sheduleTime;

	public Course() { }

	public Course(String name, String teacherFirstName, String teacherLastName,
			double hoursByWeek, String sheduleTime) {
		super();
		this.name = name;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.hoursByWeek = hoursByWeek;
		this.sheduleTime = sheduleTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}

	public double getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(double hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public String getSheduleTime() {
		return sheduleTime;
	}

	public void setSheduleTime(String sheduleTime) {
		this.sheduleTime = sheduleTime;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", teacherFirstName="
				+ teacherFirstName + ", teacherLastName=" + teacherLastName
				+ ", hoursByWeek=" + hoursByWeek + ", sheduleTime="
				+ sheduleTime + "]";
	}

}
