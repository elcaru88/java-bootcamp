package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	

public class Conexion {
	private Connection con;
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/high-school", "root", "");
		
		return con;//NO LO IMPLEMENTA
		
	}

}
