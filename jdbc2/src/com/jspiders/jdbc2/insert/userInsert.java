package com.jspiders.jdbc2.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class userInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className="com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/userdb";
		String username="root";
		String password="root";
		// query= "INSERT INTO USER VALUES(1,'ROHIT',1234567890,'RP@GMAIL.COM','ROHIT123','PUNE')";
		String query= "INSERT INTO USER VALUES(2,'SAURABH',7554517890,'SP@GMAIL.COM','SAURABH123','PUNE'),(3,'AMIT',1235369190,'AM@GMAIL.COM','AMIT123','MUMBAI'),(4,'PRANAV',2645867890,'PM@GMAIL.COM','PRANAV123','PUNE'),(5,'OMKAR',4562587890,'OB@GMAIL.COM','OMKAR123','PUNE')";
		
		Class.forName(className);
		Connection connection= DriverManager.getConnection(url, username, password);
		Statement statement= connection.createStatement();
		statement.execute(query);
		connection.close();
		
	}

}
