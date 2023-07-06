package com.jspiders.jdbc2.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className="com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/userdb";
		String username="root";
		String password="root";
		String query="UPDATE USER SET NAME='OMI' WHERE ID=5";
		
		Class.forName(className);
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement= connection.createStatement();
		statement.execute(query);
		System.out.println("Data updated successfully..!!");
		connection.close();	
	}

}
