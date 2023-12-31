package jdbc_product_batch_execution;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BatchExecution {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("TV");
		product1.setCost(25000);
		product1.setManufacturer("Sony");

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Laptop");
		product2.setCost(50000);
		product2.setManufacturer("HP");

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("AC");
		product3.setCost(40000);
		product3.setManufacturer("BlueStar");

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);

		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver); // register the driver

		FileInputStream fileInputStream = new FileInputStream("productdbconfig.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Connection connection = DriverManager.getConnection(properties.getProperty("url"), // establish connection
				properties.getProperty("user"), properties.getProperty("password"));

		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUCT VALUES (?,?,?,?)"); // create
																													// statement

		for (Product product : list) { // for each loop
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName()); // set values
			preparedStatement.setInt(3, product.getCost());
			preparedStatement.setString(4, product.getManufacturer());
			preparedStatement.addBatch();
		}

		preparedStatement.executeBatch(); // execute batch
		System.out.println("BATCH ADDED SUCCESSFULLY..!!");

		connection.close(); // close connection

	}

}
