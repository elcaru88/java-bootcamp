package data;



public class Student {
	private Integer registrationNumber;
	private String firstName;
	private String lastName;
	private String dateBirth;
	public Student(Integer registrationNumber, String firstName, String lastName, String dateBirth) {
		super();
		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
	}
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
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
		return "Student [registrationNumber=" + registrationNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateBirth=" + dateBirth + "]";
	}
	
	
	

}
