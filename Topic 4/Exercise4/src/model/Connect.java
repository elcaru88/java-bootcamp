package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private static Connection con;
	private static String url = "jdbc:mysql://localhost:3306/userservice",
			usr = "root", pas = "Fer1";

	public static Connection getConnection() throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		if (con == null) {

			con = DriverManager.getConnection(url, usr, pas);
		}
		return con;
	}

}
