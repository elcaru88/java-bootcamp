package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long attendeeId;
	
	private String lastName , firstName;

	public Attendee() {
		
	}

	public Attendee(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Attendee [attendeeId=" + attendeeId + ", lastName=" + lastName
				+ ", firstName=" + firstName + "]";
	}
	
	
	
	

}
