package com.models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection = null;

	public static Connection getActiveConnection() {
		/*String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
		String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
		System.out.println(host);*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager
					.getConnection("jdbc:mysql://127.5.181.130:3306/social?"
						+ "user=adminL5gQ1Js&password=a2JPZNLVRjYT&characterEncoding=utf8");
					//connection = DriverManager
					//.getConnection("jdbc:mysql://localhost:3306/se2firstapp?"
						//+ "user=root&password=root&characterEncoding=utf8");
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
