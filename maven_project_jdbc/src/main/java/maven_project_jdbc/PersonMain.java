package maven_project_jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		PersonCRUD crud = new PersonCRUD();

		boolean exit = true;
		System.out.println("********WELCOME*******");
		while (exit) {

			System.out.println(
					"Enter the choice\n 1.Save person \n 2.Update person \n 3.Delete Person \n 4.Get person by id \n 5.Get all person \n 6.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();

				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.savePerson(person);
			}
				break;

			case 2: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the phone");
				long phone = scanner.nextLong();

				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.updatePerson(person);
			}
				break;

			case 3: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				person.setId(id);

				crud.deletePerson(person);
			}
				break;

			case 4: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				crud.getPersonById(id);
			}
				break;

			case 5: {
				crud.getAllPerson();
			}
				break;

			case 6: {
				exit = false;
				System.out.println("THANK YOU..!!");
			}
				break;

			default:
				System.out.println("Invalid choice..!!");
			}
		}
		scanner.close();
	}
}
