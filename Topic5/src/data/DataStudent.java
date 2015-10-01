package data;

//import java.util.ArrayList;
import java.sql.*;

import entities.Course;
import entities.Notes;
import entities.Student;


public class DataStudent {
	
	public void add(Student s){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into students (registrationNumber ,firstName , lastName, birth) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, s.getRegistrationNumber());
			stmt.setString(2, s.getFirstName());
			stmt.setString(3, s.getLastName());
			stmt.setDate(4, s.getBirth()); 
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
	
	
	public Student getByRegistrationNumber(int registrationNumber){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Student s=null;
		
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"SELECT registrationNumber ,firstName , lastName, birth FROM students WHERE registrationNumber = ?"
					);
			stmt.setInt(1, registrationNumber);
			rs = stmt.executeQuery();
			if(rs !=null && rs.next()){
				s = new Student();
				s.setRegistrationNumber(registrationNumber);
				s.setFirstName(rs.getString("firstName"));
				s.setLastName(rs.getString("lastName"));
				s.setBirth(rs.getDate("birth"));
			}
		} catch (SQLException e) {
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
		return s;
	}
	

}
