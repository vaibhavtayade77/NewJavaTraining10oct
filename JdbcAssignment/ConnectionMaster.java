package com.yash.JdbcAssignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMaster {

	static String URL = "jdbc:mysql://localhost:3306/jdbcmaster";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;

		} catch (Exception ex) {
			return null;
		}
	}

}
