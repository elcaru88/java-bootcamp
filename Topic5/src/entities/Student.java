package entities;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String firstName;
	private String lastName;
	private int registrationNumber;
	private Date birth;
	//private ArrayList<Course> courses;
	
	
	public Student( String fname , String lname ,int rnmb ,Date birth){
		this.firstName = fname;
		this.lastName = lname;
		this.registrationNumber = rnmb;
		this.birth = birth;		
	}

	public Student() {
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

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.sql.Date getBirth() {
		return (java.sql.Date) birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String toString(){
		return this.lastName+ " , "+ this.firstName;
	}
	
	

}
