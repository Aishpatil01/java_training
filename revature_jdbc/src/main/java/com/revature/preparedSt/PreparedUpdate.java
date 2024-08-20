package com.revature.preparedSt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String url = "jdbc:mysql://localhost:3306/studentdb" ;
		String user = "root" ;
		String password = "root" ;
		
		String sql = "update student set password=? where id=?" ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Update the details...");
		System.out.println("***********************");
		
		System.out.println("Enter the updated password: ");
		String pass = scanner.nextLine();
		
		System.out.println("Enter the id to be updated: ");
		int id = scanner.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		
		Connection connection = DriverManager.getConnection(url, user, password) ;
		
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1, pass);
		prepareStatement.setInt(2, id);
		
		int result = prepareStatement.executeUpdate();
        if (result != 0) {
			
			System.out.println("Data updated successfully...");
		}
		else {
			
			System.out.println("Data is not updated...");
		}
		
		connection.close();
	}
}
