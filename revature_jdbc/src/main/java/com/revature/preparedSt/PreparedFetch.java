package com.revature.preparedSt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/revature_jdbc";
		String username = "root";
		String password = "root";

		String sql = "SELECT * FROM STUDENT WHERE ID=?";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the id to fetch the data: ");
		int id = scanner.nextInt();

		// 1
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2
		Connection connection = DriverManager.getConnection(url, username, password);

		// 3
		PreparedStatement prepareStatement = connection.prepareStatement(sql) ;
		prepareStatement.setInt(1, id);

		// 4
		ResultSet set = prepareStatement.executeQuery();

		while (set.next()) {
			
			System.out.println(set.getInt("id")+" | "+set.getString("name")+" | "+set.getLong("phone")+" | "+
                    set.getString("email")+" | "+set.getString("password"));
		}

		// 5
		connection.close();
	}
}
