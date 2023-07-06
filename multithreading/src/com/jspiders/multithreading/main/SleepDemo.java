package com.jspiders.multithreading.main;

public class SleepDemo {
	public static void main(String[] args) {
		String str="This is the execution of sleep() method..!!";
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
