package com.jspiders.jdbc3.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentFetch {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scanner.nextInt();

		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=root";
		String query = "SELECT * FROM STUDENT WHERE ID=?";

		Driver driver = new Driver();
		DriverManager.deregisterDriver(driver);

		Connection connection = DriverManager.getConnection(url);

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getLong("phone")); // we can use column name instead of column no
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			System.out.println("**********************");
		}
		connection.close();
	}
}
