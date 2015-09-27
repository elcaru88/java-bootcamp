package model;

public class StudentCourse {
	private int registrationNumber ;
	private String courseName ;
	private int partialNote_1 ,partialNote_2 ,partialNote_3 ,finalNote ;
	private String teacherFirstName ,teacherLastName , studentlastName,studentfirstName;
	
	
	public StudentCourse(int registrationNumber, String courseName,
			int partialNote_1, int partialNote_2, int partialNote_3,
			int finalNote) {
		super();
		this.registrationNumber = registrationNumber;
		this.courseName = courseName;
		this.partialNote_1 = partialNote_1;
		this.partialNote_2 = partialNote_2;
		this.partialNote_3 = partialNote_3;
		this.finalNote = finalNote;
	}
	

	public StudentCourse(String courseName, String teacherFirstName,
			String teacherLastName, String studentlastName,
			String studentfirstName) {
		super();
		this.courseName = courseName;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.studentlastName = studentlastName;
		this.studentfirstName = studentfirstName;
	}


	public StudentCourse(String studentlastName,String studentfirstName , 
			String courseName, int finalNote ) {
		super();
		this.courseName = courseName;
		this.finalNote = finalNote;
		this.studentlastName = studentlastName;
		this.studentfirstName = studentfirstName;
	}

	
	

	public int getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getPartialNote_1() {
		return partialNote_1;
	}


	public void setPartialNote_1(int partialNote_1) {
		this.partialNote_1 = partialNote_1;
	}


	public int getPartialNote_2() {
		return partialNote_2;
	}


	public void setPartialNote_2(int partialNote_2) {
		this.partialNote_2 = partialNote_2;
	}


	public int getPartialNote_3() {
		return partialNote_3;
	}


	public void setPartialNote_3(int partialNote_3) {
		this.partialNote_3 = partialNote_3;
	}


	public int getFinalNote() {
		return finalNote;
	}


	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}


	public String getTeacherFirstName() {
		return teacherFirstName;
	}


	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}


	public String getTeacherLastName() {
		return teacherLastName;
	}


	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}


	public String getStudentlastName() {
		return studentlastName;
	}


	public void setStudentlastName(String studentlastName) {
		this.studentlastName = studentlastName;
	}


	public String getStudentfirstName() {
		return studentfirstName;
	}


	public void setStudentfirstName(String studentfirstName) {
		this.studentfirstName = studentfirstName;
	}


	@Override
	public String toString() {
		return "StudentCourse [registrationNumber=" + registrationNumber
				+ ", courseName=" + courseName + ", partialNote_1="
				+ partialNote_1 + ", partialNote_2=" + partialNote_2
				+ ", partialNote_3=" + partialNote_3 + ", finalNote="
				+ finalNote + "]";
	}
	
}