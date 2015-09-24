package entities;

public class Notes {
	
	private double firstPartial;
	private double secondPartial;
	private double thirtPartial;
	private double finalNote;
	private Course course;
	private Student student;
	public double getFirstPartial() {
		return firstPartial;
	}
	public void setFirstPartial(double firstPartial) {
		this.firstPartial = firstPartial;
	}
	public double getSecondPartial() {
		return secondPartial;
	}
	public void setSecondPartial(double secondPartial) {
		this.secondPartial = secondPartial;
	}
	public double getThirtPartial() {
		return thirtPartial;
	}
	public void setThirtPartial(double thirtPartial) {
		this.thirtPartial = thirtPartial;
	}
	public double getFinalNote() {
		return finalNote;
	}
	public void setFinalNote(double finalNote) {
		this.finalNote = finalNote;
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
	
	
	
	

}
