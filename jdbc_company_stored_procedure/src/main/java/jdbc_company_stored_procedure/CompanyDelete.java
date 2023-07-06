package jdbc_company_stored_procedure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class CompanyDelete {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id..!!");
		int id = scanner.nextInt();

		FileInputStream fileInputStream = new FileInputStream("companydb.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));

		CallableStatement callableStatement = connection.prepareCall("call companydb.company_delete(?)");

		callableStatement.setInt(1, id);

		int count = callableStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Data deleted successfully..!!");
		} else {
			System.out.println("Failed to delete data..!!");
		}
		connection.close();
		scanner.close();
	}

}
