package model;

import java.sql.SQLException;

import junit.framework.TestCase;



public class MysqlTest extends TestCase {
	

	public void test() throws ClassNotFoundException, SQLException {
		System.out.println(AccionStudentCourse.getAll());
	}
	

}
