package com.jspiders.jdbc.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeFetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String className = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employeedb?user=root&password=root";
		// String userName="root";
		// String password="root";
		String query = "SELECT * FROM EMPLOYEE";

		Class.forName(className);
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {    //next method will return true if there is column in DB
			System.out.println(resultSet.getInt(1));      //column no as argument
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getLong(3));
			System.out.println(resultSet.getString(4));
			System.out.println("******************");
		}
		connection.close();
	}

}
