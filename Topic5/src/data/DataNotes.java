package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import entities.Course;
import entities.Student;
import sun.awt.dnd.SunDragSourceContextPeer;

public class DataNotes {
	
	public void setFirstPartial( String name , int registrationNumber ,int note){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"UPDATE `student-course` SET firstPartial= ?   WHERE  name = ? AND `registrationNumber` = ? " ,PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, note);
			stmt.setString(2, name);
			stmt.setInt( 3 , registrationNumber);
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
	
	public void setFinalNote( String name , int registrationNumber ,int note){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"UPDATE `student-course` SET finalNote= ?   WHERE  name = ? AND `registrationNumber` = ? " ,PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, note);
			stmt.setString(2, name);
			stmt.setInt( 3 , registrationNumber);
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

	public String getFinalNotesByRegistrationNumber(int registrationNumber) {
		
		ResultSet rs=null;
		PreparedStatement stmt=null;
		String text = new String();
		
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"select finalNote , name  from`student-course`  where registrationNumber = ? ORDER BY finalNote DESC"
					);
			stmt.setInt(1, registrationNumber);
			rs = stmt.executeQuery();
			if(rs !=null ){
				while ( rs.next()) {
					text = text +" "+ rs.getInt("finalNote") +" , "+ rs.getString("name")+ "\n";	
				}
			}			
			
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
		return text;
	}

}
