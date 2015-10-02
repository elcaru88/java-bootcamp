package data;

public class PartialNotes {
	private double partialNote1;
	private double partialNote2;
	private double partialNote3;
	private double partialNoteFinal;
	private Course course;
	private Student student;
	public double getPartialNote1() {
		return partialNote1;
	}
	public void setPartialNote1(double partialNote1) {
		this.partialNote1 = partialNote1;
	}
	public double getPartialNote2() {
		return partialNote2;
	}
	public void setPartialNote2(double partialNote2) {
		this.partialNote2 = partialNote2;
	}
	public double getPartialNote3() {
		return partialNote3;
	}
	public void setPartialNote3(double partialNote3) {
		this.partialNote3 = partialNote3;
	}
	public double getPartialNoteFinal() {
		return partialNoteFinal;
	}
	public void setPartialNoteFinal(double partialNoteFinal) {
		this.partialNoteFinal = partialNoteFinal;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "PartialNotes [partialNote1=" + partialNote1 + ", partialNote2=" + partialNote2 + ", partialNote3="
				+ partialNote3 + ", partialNoteFinal=" + partialNoteFinal + ", course=" + course + ", student="
				+ student + "]";
	}
	
	
	

}
