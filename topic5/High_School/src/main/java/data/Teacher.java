package data;

public class Teacher {
	private Integer idTeacher;
	private String firstName;
	private String lastName;
	private String dateBirth;
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
