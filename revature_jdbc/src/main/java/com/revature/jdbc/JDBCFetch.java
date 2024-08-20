package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCFetch {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/revature_jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		String sql = "select * from student" ;
		
		
		try {
			
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			Connection connection = DriverManager.getConnection(url, username, password);
			
			// Create the statement/prepared statement/callable statement
			Statement statement = connection.createStatement();
			
			// Execute statements and get the result
			ResultSet set = statement.executeQuery(sql);
			
			// Process the result set
			while (set.next()) {
				
				System.out.println(set.getInt("id")+" | "+set.getString(2)+" | "+set.getLong("phone")+" | "+set.getString("email")+" | "+set.getString(5));
			}
			
			// Close the connection
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
