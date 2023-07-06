package maven_project_jdbc_2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner scanner = new Scanner(System.in);
		UserCRUD userCRUD = new UserCRUD();
		User user = new User();

		boolean exit = true;
		do {
			System.out.println("Enter the choice \n 1.Signup User \n 2.Login User \n 3.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter your id..!!");
				user.setId(scanner.nextInt());
				System.out.println("Enter your name..!!");
				user.setName(scanner.next());
				System.out.println("Enter your email..!!");
				user.setEmail(scanner.next());
				System.out.println("Enter your password..!!");
				user.setPassword(scanner.next());
				System.out.println("Enter your address..!!");
				user.setAddress(scanner.next());

				userCRUD.signupUser(user);
			}
				break;

			case 2: {
				System.out.println("Enter your email..!!");
				String email = scanner.next();
				user.setEmail(email);
				System.out.println("Enter your password..!!");
				user.setPassword(email);
				user.setPassword(scanner.next());

				boolean result = userCRUD.loginUser(user);
				if (result) {
					System.out.println("Logged in successfully..!!");
					userCRUD.displayPassword(email);
					boolean flag = true;
					do {
						System.out.println("Enter the choice \n 1.Update Passwords \n 2.Logout");
						int choice1 = scanner.nextInt();
						switch (choice1) {
						case 1: {
							System.out.println("Enter Facebook Password..!!");
							String facebook = scanner.next();
							System.out.println("Enter Instagram Password..!!");
							String instagram = scanner.next();
							System.out.println("Enter Snapchat Password..!!");
							String snapchat = scanner.next();
							System.out.println("Enter Whatsapp Password..!!");
							String whatsapp = scanner.next();
							System.out.println("Enter Twitter Password..!!");
							String twitter = scanner.next();

							user.setFacebook(facebook);
							user.setInstagram(instagram);
							user.setSnapchat(snapchat);
							user.setWhatsapp(whatsapp);
							user.setTwitter(twitter);

							userCRUD.updatePasswords(user);
						}
						case 2: {
							flag = false;
						}
						default:
							break;
						}

					} while (flag);
				} else {
					System.out.println("Failed to login");
				}
			}

			default:
				break;
			}
		} while (exit);
	}
}
