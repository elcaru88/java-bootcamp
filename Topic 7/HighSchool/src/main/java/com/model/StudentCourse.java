package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.model.classId.CourseId;
import com.model.classId.StudentCourseId;

@Entity
@IdClass(StudentCourseId.class)
public class StudentCourse implements Serializable{
	
	@Id
	private int registrationNumber ;
	
	@Id
	private String courseName ;
	

	private Integer partialNote_1 ,partialNote_2  ,partialNote_3 ,finalNote ;

	public StudentCourse() {
		
	}

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

	@Override
	public String toString() {
		return "StudentCourse [registrationNumber=" + registrationNumber
				+ ", courseName=" + courseName + ", partialNote_1="
				+ partialNote_1 + ", partialNote_2=" + partialNote_2
				+ ", partialNote_3=" + partialNote_3 + ", finalNote="
				+ finalNote + "]";
	}
	
}
