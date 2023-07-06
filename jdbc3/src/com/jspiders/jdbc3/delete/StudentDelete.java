package com.jspiders.jdbc3.delete;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//import com.mysql.cj.jdbc.Driver;

public class StudentDelete {
	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scanner.nextInt();

		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=root";
		String query = "DELETE FROM STUDENT WHERE ID=?";

		// Driver driver= new Driver();
		// DriverManager.registerDriver(driver);

		Driver driver = new com.mysql.cj.jdbc.Driver(); // we can use driver interface by doing upCasting instead of
														// using driver class
		DriverManager.registerDriver(driver); // + that is for line no 22

		Connection connection = DriverManager.getConnection(url);

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		int count = preparedStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Data deleted successfully..!!");
		} else {
			System.out.println("Data not deleted..!!");
		}
		connection.close();
	}

}
