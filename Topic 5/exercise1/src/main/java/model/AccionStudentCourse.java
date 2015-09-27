package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccionStudentCourse {
	


	public static StudentCourseList getAll() throws SQLException, ClassNotFoundException {
		Connection con = Conection.getConexion();
		StudentCourseList studentCourseList = new StudentCourseList();
		StudentCourse studentCourse;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from studentCourse");
		while (rs.next()) {
				studentCourse = new StudentCourse(rs.getInt("registrationNumber"), rs.getString("courseName"),
					rs.getInt("partialNote_1"),rs.getInt("partialNote_2"),rs.getInt("partialNote_3"),rs.getInt("finalNote"));
				studentCourseList.add(studentCourse);
		}

		return studentCourseList;
	}
	

	/* List students and teachers for a given course. The output format should
	 * be:
	 * 
	 * Course: <course-name> Teacher: <last-name>, <first-name> Students:
	 * <last-name>, <first-name> (ordered by alphabetically by last name) */

	
	public static StudentCourseList getCourse(String courseName)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = Conection.getConexion();

		StudentCourseList studentCourseList = new StudentCourseList();
		StudentCourse studentCourse;
		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select courseName, teacherFirstName ,teacherLastName ,lastName, firstName "
						+ " from studentCourse,course,student "
						+ " where courseName='"
						+ courseName
						+ "'"
						+ " and course.name = studentCourse.courseName "
						+ " and student.registrationNumber = studentCourse.registrationNumber "
						+ " and course.sheduleTime = 'Thursday 15:00 - 17:00' "						
						+ " ORDER BY lastName ");
		while (rs.next()) {

			studentCourse = new StudentCourse(rs.getString("courseName"), rs.getString("teacherFirstName"),
					rs.getString("teacherLastName"), rs.getString("student.lastName"),
					rs.getString("student.firstName"));

			studentCourseList.add(studentCourse);
		}
		return studentCourseList;
	}

	/* List final course notes for a given student (the input should be the
	 * registration number). They should be ordered by highest notes and course
	 * name) */

	public static StudentCourseList getFinalNote(int registrationNumber)
			throws ClassNotFoundException, SQLException {

		Connection con = Conection.getConexion();
		StudentCourseList studentCourseList = new StudentCourseList();
		StudentCourse studentCourse;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT lastName,firstName,courseName,finalNote FROM student, studentCourse "
						+ " where studentCourse.registrationNumber ="
						+ registrationNumber
						+ " and student.registrationNumber = studentCourse.registrationNumber "
						+ " ORDER BY finalNote , courseName ");
		
		while (rs.next()) {
			studentCourse = new StudentCourse(rs.getString("lastName"),
					rs.getString("firstName"), rs.getString("courseName"),
					rs.getInt("finalNote"));

			studentCourseList.add(studentCourse);
		}
		return studentCourseList;
	}

/*	public static void delete(int codigo) throws SQLException,
			ClassNotFoundException {
		Connection con = Conection.getConexion();
		PreparedStatement ps = con
				.prepareStatement("delete from new_table where codigo=?");
		ps.setInt(1, codigo);
		ps.execute();
	}	*/
	
}
