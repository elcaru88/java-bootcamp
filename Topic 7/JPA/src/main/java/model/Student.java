package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@OneToMany(mappedBy = "student")
    private Set<StudentCourse> studentCourse = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registrationNumber;
	
	private String firstName, lastName;
	private Date dateOfBirth;

	public Student() {
	}

	public Student(String firstName, String lastName, Date dateOfBirth) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [registrationNumber=" + registrationNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
