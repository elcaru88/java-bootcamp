package com.pruebas.model;

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
@Table(name="courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcourse")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="assignedteacher")
	private int assignedteacherid;
	
	@Column(name="hoursperweek")
	private int hoursperweek;
	
	@ManyToMany(mappedBy="courses", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Student> students;

	public Course(int assignedTeacher, String name, int hourseperweek) {
		this.assignedteacherid = assignedTeacher;
		this.name = name;
		this.hoursperweek = hourseperweek;
	}
	
	public Course() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignedteacherid() {
		return assignedteacherid;
	}

	public void setAssignedteacherid(int assignedteacherid) {
		this.assignedteacherid = assignedteacherid;
	}

	public int getHoursperweek() {
		return hoursperweek;
	}

	public void setHoursperweek(int hoursperweek) {
		this.hoursperweek = hoursperweek;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignedteacherid=" + assignedteacherid + ", hoursperweek=" + hoursperweek + "]";
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
