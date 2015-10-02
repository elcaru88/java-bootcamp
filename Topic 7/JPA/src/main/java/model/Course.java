package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	private String name;

	@OneToOne
	private Teacher teacher;

	private double hoursByWeek;
	private String sheduleTime;

	public Course() { }

	public Course(String name, Teacher teacher, double hoursByWeek,
			String sheduleTime) {
		
		this.name = name;
		this.teacher = teacher;
		this.hoursByWeek = hoursByWeek;
		this.sheduleTime = sheduleTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
		return "Course [name=" + name + ", teacher=" + teacher
				+ ", hoursByWeek=" + hoursByWeek + ", sheduleTime="
				+ sheduleTime + "]";
	}

}
