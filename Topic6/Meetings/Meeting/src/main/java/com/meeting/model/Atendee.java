package com.meeting.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Atendee {
	
	@Id
	private int dni;
	private String name;

	public Atendee(int dni, String name, int age) {
		super();
		this.dni = dni;
		this.name = name;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Atendees [dni=" + dni + ", name=" + name + "]";
	}
	
}
