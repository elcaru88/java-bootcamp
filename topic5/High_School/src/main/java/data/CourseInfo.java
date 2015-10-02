package data;

public class CourseInfo {
	private String courseName;
	private String teachetFirstName;
	private String teacherLastName;
	private String firstName;
	private String lastName;
	
	
	
	public CourseInfo(String courseName, String teachetFirstName, String teacherLastName, String firstName,
			String lastName) {
		super();
		this.courseName = courseName;
		this.teachetFirstName = teachetFirstName;
		this.teacherLastName = teacherLastName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeachetFirstName() {
		return teachetFirstName;
	}
	public void setTeachetFirstName(String teachetFirstName) {
		this.teachetFirstName = teachetFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
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
	@Override
	public String toString() {
		return "CourseInfo [courseName=" + courseName + ", teachetFirstName=" + teachetFirstName + ", teacherLastName="
				+ teacherLastName + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
