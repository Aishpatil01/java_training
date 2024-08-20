package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/revature_jdbc";
		String username = "root";
		String password = "root";

		String sql = "delete from student where phone=7411258963";

		// 1
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2
		Connection connection = DriverManager.getConnection(url, username, password);

		// 3
		Statement statement = connection.createStatement();

		// 4
		int result = statement.executeUpdate(sql);

		if (result != 0) {

			System.out.println("Data deleted...");
		} else {

			System.out.println("Not deleted...");
		}

		// 5
		connection.close();
	}
}
