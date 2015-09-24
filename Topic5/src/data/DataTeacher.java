package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Student;
import entities.Teacher;

public class DataTeacher {

	public void add(Teacher t){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into teacher (idTeacher ,firstName , lastName, birth) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, t.getIdTeacher());
			stmt.setString(2, t.getFirstName());
			stmt.setString(3, t.getLastName());
			stmt.setDate(4, t.getBirth()); 
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
	
	public Teacher getById(int idTeacher) {
		
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Teacher t = null;
		
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"select idTeacher , firstName , lastName , birth from teacher where idTeacher = ?"
					);
			stmt.setInt(1, idTeacher);
			rs = stmt.executeQuery();
			if(rs !=null && rs.next()){
				t = new Teacher();
				t.setIdTeacher(idTeacher);
				t.setFirstName(rs.getString("firstName"));
				t.setLastName(rs.getString("lastName"));
				t.setBirth(rs.getDate("birth"));
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
		return t;
	}
}
