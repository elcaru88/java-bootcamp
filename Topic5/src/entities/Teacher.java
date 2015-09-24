package entities;

import java.util.Date;

public class Teacher {
	
	private int idTeacher;
	private String firstName;
	private String lastName;
	private Date birth;
	
	
	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	
	public Teacher( int idTeacher , String fname , String lname ,Date birth){
		this.idTeacher = idTeacher;
		this.firstName = fname;
		this.lastName = lname;
		this.birth = birth;		
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
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

	public java.sql.Date getBirth() {
		return (java.sql.Date) birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
