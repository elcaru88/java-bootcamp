package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

	private static Connection con;
	private static String url = "jdbc:mysql://localhost:3306/high_school",
			usr = "root", pas = "Fer1";

	public static Connection getConexion() throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		if (con == null) {

			con = DriverManager.getConnection(url, usr, pas);
		}
		return con;
	}
	

}
