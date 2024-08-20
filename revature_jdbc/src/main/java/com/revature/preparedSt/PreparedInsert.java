package com.revature.preparedSt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/revature_jdbc";
		String user = "root";
		String password = "root";

		String sql = "insert into student values(?,?,?,?,?)";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the id: ");
		int id = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter the name: ");
		String studentName = scanner.nextLine();

		System.out.println("Enter the phone number: ");
		long phone = scanner.nextLong();

		scanner.nextLine();
		System.out.println("Enter the email: ");
		String address = scanner.nextLine();

		System.out.println("Enter the password: ");
		String pass = scanner.nextLine();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, user, password);

		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, studentName);
		prepareStatement.setLong(3, phone);
		prepareStatement.setString(4, address);
		prepareStatement.setString(5, pass);

		int result = prepareStatement.executeUpdate();
		if (result != 0) {

			System.out.println("Data inserted successfully...");
		} else {

			System.out.println("Data is not inserted...");
		}

		connection.close();
	}
}
