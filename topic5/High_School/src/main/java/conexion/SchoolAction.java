package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import data.Course;
import data.CourseInfo;
import data.CoursesInfo;
import data.Student;
import data.Students;
import data.Teacher;
import data.Teachers;

public class SchoolAction {
	//STUDENT
	public Students readStudents() throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		ResultSet rs = st.executeQuery("Select * from student_table");
		Students stds = new Students();
		while (rs.next()) {
			Student std = new Student(rs.getInt("registrationNumber"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("dateBirth"));
			stds.addStudent(std);
		}
		return stds;
		
	}
	
	public void createStudents(Student std) throws ClassNotFoundException, SQLException {
		boolean ok=true;
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		// existe alumno?
		ResultSet rs = st.executeQuery("Select * from student_table");
		while (rs.next()) {
			if (rs.getInt("registrationNumber")==std.getRegistrationNumber()) {
				ok=false;
				break;
			}
		}
		if (ok==true) {
			 st.executeUpdate("insert into student_table values ('"+std.getRegistrationNumber()+"', '"+std.getFirstName()+"', '"+std.getLastName()+"', '"+std.getDateBirth()+"') ");
			 //es creado
		}
				
	}
	//TEACHER
	public Teachers readTeachers() throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		ResultSet rs = st.executeQuery("Select * from teacher_table");
		Teachers tcs = new Teachers();
		while (rs.next()) {
			Teacher tc = new Teacher(rs.getInt("idTeacher"), rs.getString("tFirstName"), rs.getString("tLastName"), rs.getString("tDateBirth"));
			tcs.addTeacher(tc);
		}
		return tcs;
		
	}
	
	public void createTeachers(Teacher tc) throws ClassNotFoundException, SQLException {
		boolean ok=true;
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		// existe teacher?
				ResultSet rs = st.executeQuery("Select * from teacher_table");
				while (rs.next()) {
					if (rs.getInt("idTeacher")==tc.getIdTeacher()) {
						ok=false;
						break;
					}
				}
				if (ok==true) {
					st.executeUpdate("insert into teacher_table values ('"+tc.getIdTeacher()+"', '"+tc.getFirstName()+"', '"+tc.getLastName()+"', '"+tc.getDateBirth()+"') "); 
					 //it's made
				}
		 
				
	}
	
	//COURSE
	public void createCourse(Course cr) throws ClassNotFoundException, SQLException {
		boolean ok= true;
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		//validar curso	
		ResultSet rs = st.executeQuery("Select * from course_table");
		while (rs.next()) {
			if (rs.getString("cName").equals(cr.getName()) && rs.getString("scheduleTime").equals(cr.getScheduleTime())) {
				ok=false;
				break;
			}
		}
		if (ok==true) {
			st.executeUpdate("insert into course_table values ('"+cr.getName()+"', '"+cr.getAssignedTeacher().getIdTeacher()+"', '"+cr.getHoursByWeek()+"', '"+cr.getScheduleTime()+"' ) ");//SCHEDULE
			 //it's made
		}
		 
	}
	//add student to course and notes§§§§
	public void createNotes(Integer idStudent, String cr, double finalNote) throws ClassNotFoundException, SQLException {
		boolean ok= true;
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		//validar campos
		ResultSet rs = st.executeQuery("Select * from student_course");
		while (rs.next()) {
			if (rs.getString("cName").equals(cr) && rs.getInt("registrationNumber")== idStudent) {
				ok= false;
				break;
			}
		}
		if (ok==true) {
			st.executeUpdate("insert into student_course (registrationNumber,cName,finalNote) values ('"+idStudent+"', '"+cr+"' , '"+finalNote+"') ");
			//it's made
		}
		 
		 //, '"+init+"', '"+init+"', '"+init+"', '"+init+"'
				
		 
	}
	
	//RESTU student and cousr
	public void getStudentInfo(Integer idStudent) throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		ResultSet rs = st.executeQuery(" SELECT * from student_course "
				+" INNER JOIN course_table ON student_course.cName = course_table.cName "
				+" INNER JOIN student_table ON student_table.registrationNumber = student_course.registrationNumber "
				+" where student_course.registrationNumber= '"+idStudent+"' order by student_course.finalNote desc  ");
		boolean ok= true;
		while (rs.next()) {

			if (ok==true) {
				System.out.println("firstName "+rs.getString("firstName")+" lastName "+ rs.getString("lastName") );
				ok=false;
			}
				System.out.println("Course name "+rs.getString("cName")+" Final note "+ rs.getString("finalNote") );
			
			
		}
		
	}
	
	public void getCourseInfo(String course) throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		Connection cc= c.getConnection();
		Statement st = cc.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM student_course " 
+" INNER JOIN  student_table ON student_table.registrationNumber = student_course.registrationNumber"
+" INNER JOIN course_table ON course_table.cName = student_course.cName"
+" INNER JOIN teacher_table ON  teacher_table.idTeacher = course_table.assignedTeacher"
+" WHERE  student_course.cName = '"
+course+"' ORDER BY student_table.lastName ");
		CoursesInfo cis = new CoursesInfo();
		//System.out.println(rs.getString("name"));;
		while (rs.next()) {
			CourseInfo ci = new CourseInfo(rs.getString("cName"), rs.getString("tFirstName"), rs.getString("tLastName"), rs.getString("firstName"), rs.getString("lastName"));
			cis.addInfo(ci);
			//System.out.println("Students \n "+ci.getLastName()+", "+ci.getFirstName()+" "+ci.getTeachetFirstName());
		}
		
		System.out.println("Course: "+"<"+cis.getInfo().get(0).getCourseName()+">");
		System.out.println("Teacher: <"+cis.getInfo().get(0).getTeacherLastName()+">, <"+cis.getInfo().get(0).getTeachetFirstName()+">");
		System.out.println("Students:");
		for (CourseInfo ciss : cis.getInfo()) {	
							System.out.println("<"+ciss.getLastName()+">, <"+ciss.getFirstName()+">");
							}
	}
	
	
}
