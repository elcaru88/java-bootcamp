package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class DataCourse {
	
	public Course getByName(String name){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
		ResultSet rs2=null;
		PreparedStatement stmt2=null;
		
		Student s = null;
		Course c = null;
		DataTeacher dt = new DataTeacher();
		DataStudent dstu = new DataStudent();
		
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"SELECT name , hoursByWeek , idTeacher FROM course WHERE name = ?"
					);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			
			if(rs !=null && rs.next()){
				c = new Course();
				c.setHoursByWeek(rs.getInt("hoursByWeek"));
				c.setName(rs.getString("name"));
				c.setAssignedTeacher(dt.getById( rs.getInt("idTeacher")));
			}
			
		    }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try {
					if(rs!=null)rs.close();
					if(stmt!=null) stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				FactoryConexion.getInstancia().releaseConn();
			}

			
				// AGREGAR ALUMNOS AL CURSO
		try {		
				stmt2 = FactoryConexion.getInstancia().getConn().prepareStatement(
						"SELECT `name`, `registrationNumber`  FROM `student-course` WHERE `student-course`.name = ?  " );
					
				stmt2.setString( 1 , c.getName() );
				rs2 = stmt2.executeQuery();
				
				if (rs2 !=null ) {
					
					ArrayList<Student> students = new ArrayList<Student>();
					
					while (rs2.next()) {
						s = new Student();
						s = dstu.getByRegistrationNumber( rs2.getInt("registrationNumber"));
						students.add(s);
					}
					c.setStudents(students);
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs!=null)rs2.close();
				if(stmt!=null) stmt2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FactoryConexion.getInstancia().releaseConn();
		}
		return c;
	}

	public void add(Course c){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into course (name , hoursByWeek , idTeacher) values (?,?,?)" ,PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setString( 1 , c.getName());
			stmt.setInt(2 , c.getHoursByWeek());
			stmt.setInt(3, c.getAssignedTeacher().getIdTeacher());
			stmt.execute();

			rs=stmt.getGeneratedKeys();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
				if(rs!=null ) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
	}
	
	// AGREGAR ESTUDIANTE
	public void addStudent( String name , int registrationNumber ){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"INSERT INTO  `student-course` ( name , registrationNumber ) VALUES (?,?)" ,PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setString( 1 , name);
			stmt.setInt( 2 , registrationNumber);
			stmt.execute();
			rs=stmt.getGeneratedKeys();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
				if(rs!=null ) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
	}

}
