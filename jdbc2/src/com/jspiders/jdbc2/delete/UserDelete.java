package com.jspiders.jdbc2.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/userdb";
		String username = "root";
		String password = "root";
		String query = "DELETE FROM USER WHERE ID=5";

		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		int res = statement.executeUpdate(query);
		if (res==1) {
			System.out.println("Data deleted successfully..!!");
		} else {
			System.out.println("Data not deleted..!!");
		}
		connection.close();
	}

}
