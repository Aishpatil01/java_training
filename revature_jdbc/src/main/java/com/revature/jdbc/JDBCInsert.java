package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/revature_jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		String sql = "insert into student values(2,'Aishwarya',9876453210,'ap@gmail.com','a@123'),(3,'Sam',7410258963,'sam@gmail.com','sam@123')" ;
		
		// 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2
		Connection connection = DriverManager.getConnection(url, username, password);
		
		// 3
		Statement statement = connection.createStatement();
		
		// 4
		int result = statement.executeUpdate(sql);
		
		if(result!=0) {
			
			System.out.println("Data inserted...");
		}
		else {
			
			System.out.println("Not inserted...");
		}
		
		// 5
		connection.close();
	}
}
