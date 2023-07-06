package com.jspiders.jdbc4.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jspiders.jdbc4.operations.CrudOperations;

public class CrudDriver {
	static Scanner scanner = new Scanner(System.in);
	static CrudOperations crudOperations = new CrudOperations();

	public static void main(String[] args) throws SQLException {
		System.out.println("*****WELCOME..!!*****");
		boolean exists = true;
		while (exists) {
			System.out.println(
					"Enter your choice.. \n 1.Insert the date.. \n 2.Update the data.. \n 3.Delete the data.. \n 4.Show data.. \n 5.Show all data..");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				crudOperations.insert();
				break;
			case 2:
				crudOperations.update();
				break;
			case 3:
				crudOperations.delete();
				break;
			case 4:
				crudOperations.showData();
				;
				break;
			case 5:
				crudOperations.ShowAllData();
				;
				break;

			default:
				System.out.println("Invalid choice..!!");
				break;
			}
		}
	}

}
