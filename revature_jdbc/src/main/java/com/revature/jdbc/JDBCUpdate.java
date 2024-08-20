package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/revature_jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		String sql = "update student set name='Mahi',email='mahi@gmail.com',password='mahi@07' WHERE ID=3" ;
		
		// 1
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		// 2
		Connection connection = DriverManager.getConnection(url, username, password);
				
		// 3
		Statement statement = connection.createStatement();
		
		// 4
		int result = statement.executeUpdate(sql);
				
		if(result!=0) {
					
			System.out.println("Data updated...");
		}
		else {
					
			System.out.println("Not updated...");
		}
				
		// 5
		connection.close();
			
	}
}
