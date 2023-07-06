package com.jspiders.multithreading.main;
import com.jspiders.multithreading.resources.Account;
import com.jspiders.multithreading.threads.Person1;
import com.jspiders.multithreading.threads.Person2;

public class AccountMain {
	public static void main(String[] args) {
		Account account=new Account(10000);
		Person1 person1= new Person1(account);
		Person2 person2= new Person2(account);
		person1.start();
		person2.start();
		
	}

}
//      we have provided synchronized keyword to checkBalance and depositAmount methods in account class
//      thats why we are getting same final outputs at any time
