package com.pruebas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iduser")
	private int iduser;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateofbirth")
	private String dateofbirth;
	
	// un User puede puede tener Carts(compras)
	@OneToMany(mappedBy = "user")
	private List<Cart> carts;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", dateofbirth=" + dateofbirth + "]";
	}

	public User( String password, String firstName, String lastName, String dateofbirth) {
		super();
		this.password = password;
		this.firstname = firstName;
		this.lastname = lastName;
		this.dateofbirth = dateofbirth;
	}

	public User() {
		
	}

    
}
