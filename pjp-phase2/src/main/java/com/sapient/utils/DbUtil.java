package com.sapient.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch10";
		String user = "root";
		String password = "Welcome#123";

		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}
}
