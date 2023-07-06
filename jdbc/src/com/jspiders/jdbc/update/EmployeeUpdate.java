package com.jspiders.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className="com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/employeedb";
		String username="root";
		String password="root";
		String query= "UPDATE EMPLOYEE SET NAME='RAM' WHERE ID=3";
		
		Class.forName(className);
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement= connection.createStatement();
		statement.execute(query);
		connection.close();	
	}

}
