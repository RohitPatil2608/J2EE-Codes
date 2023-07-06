package com.jspiders.multithreading.resources;

public class Account {
	int accountBalance;
	
	public Account(int accountBalance) {
		
		this.accountBalance=accountBalance;
	}
	
	public synchronized void checkBalance() {
		System.out.println("Current Balance: "+ accountBalance);
	}
	
	public synchronized void depositAmount(int amount) {
		System.out.println("Depositing" +amount+"rs in account");
	    accountBalance += amount;
	    checkBalance();
	}
	
	public void withdrawAmount(int amount) {
		System.out.println("Trying to withdraw" +amount+"rs from account");
		if(amount>accountBalance) {
			System.out.println("Insufficient balance");
		}else {
			accountBalance -= amount;
			checkBalance();
		}
	}
	

}
