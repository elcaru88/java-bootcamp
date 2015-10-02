package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StudentCourse {

	@Id
	@ManyToOne
	private Student registrationNumber;
	
	@Id
	@OneToOne
	private Course courseName;
	
	private int partialNote_1, partialNote_2, partialNote_3, finalNote;

	public StudentCourse() {

	}

	public StudentCourse(Student registrationNumber, Course courseName,
			int partialNote_1, int partialNote_2, int partialNote_3,
			int finalNote) {

		this.registrationNumber = registrationNumber;
		this.courseName = courseName;
		this.partialNote_1 = partialNote_1;
		this.partialNote_2 = partialNote_2;
		this.partialNote_3 = partialNote_3;
		this.finalNote = finalNote;
	}

	public Student getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Student registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Course getCourseName() {
		return courseName;
	}

	public void setCourseName(Course courseName) {
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

	@Override
	public String toString() {
		return "StudentCourse [registrationNumber=" + registrationNumber
				+ ", courseName=" + courseName + ", partialNote_1="
				+ partialNote_1 + ", partialNote_2=" + partialNote_2
				+ ", partialNote_3=" + partialNote_3 + ", finalNote="
				+ finalNote + "]";
	}

}