package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_table")
public class Teacher {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idTeacher")
	private Integer idTeacher;
	
	@Column(name="tFirstName")
	private String firstName;
	
	@Column(name="tLastName")
	private String lastName;
	
	@Column(name="tDateBirth")
	private String dateBirth;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(Integer idTeacher, String firstName, String lastName, String dateBirth) {
		super();
		this.idTeacher = idTeacher;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
	}
	public Integer getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateBirth=" + dateBirth + "]";
	}
	
	

}
