package com.jspiders.jdbc4.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class CrudOperations {

	static String url = "jdbc:mysql://localhost:3306/persondb?user=root&password=root";
	Scanner scanner = new Scanner(System.in);

	public void insert() throws SQLException {
		System.out.println("Enter id..!!");
		int id = scanner.nextInt();
		System.out.println("Enter name..!!");
		String name = scanner.next();
		System.out.println("Enter phone..!!");
		long phone = scanner.nextLong();
		String query = "INSERT INTO PERSON VALUES(?,?,?)";

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setLong(3, phone);
		System.out.println(preparedStatement.executeUpdate() + "ROW INSERTED..!!");
	}

	public void update() throws SQLException {
		System.out.println("Enter id..!!");
		int id = scanner.nextInt();
		System.out.println("Enter name..!!");
		String name = scanner.next();
		System.out.println("Enter phone..!!");
		long phone = scanner.nextLong();
		String query = "UPDATE PERSON SET NAME=?, PHONE=? WHERE ID=?";

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, name);
		preparedStatement.setLong(2, phone);
		preparedStatement.setInt(3, id);
		System.out.println(preparedStatement.executeUpdate() + "ROW UPDATED..!!");
	}

	public void delete() throws SQLException {
		System.out.println("Enter id..!!");
		int id = scanner.nextInt();
		String query = "DELETE FROM PERSON WHERE ID=?";

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		System.out.println(preparedStatement.executeUpdate() + "ROW DELETED..!!");
	}

	public void showData() throws SQLException {
		System.out.println("Enter id..!!");
		int id = scanner.nextInt();
		String query = "SELECT * FROM PERSON WHERE ID=?";

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getLong(3));
			System.out.println("************************");
		}
	}

	public void ShowAllData() throws SQLException {
		String query = "SELECT * FROM PERSON";

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getLong(3));
			System.out.println("************************");
		}
	}

}
