package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Course;
import entities.ScheduleTime;

public class DataSchedule {

	public  ArrayList<ScheduleTime> getByCourse(String name) {
		ResultSet rs=null;
		PreparedStatement stmt=null;
		ScheduleTime st = null;
		DataTeacher dt = new DataTeacher();
		DataSchedule ds = new DataSchedule();
		ArrayList<ScheduleTime> schedules = new ArrayList<ScheduleTime>();
		
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"select name , fromTime , toTime , day FROM schedule WHERE name = ?"
					);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			if(rs !=null ){
				    while(rs.next()) {
					st = new ScheduleTime();
					st.setDay(rs.getString("day"));
					st.setFinishHour(rs.getTime("toTime"));
					st.setInitialHour(rs.getTime("fromTime"));
					schedules.add(st);
					}				
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
		return schedules;
	}
}
