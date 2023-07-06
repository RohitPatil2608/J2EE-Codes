package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resources.Bike;
import com.jspiders.multithreading.threads.Friend1;
import com.jspiders.multithreading.threads.Friend2;

public class DeadlockMain2 {
	public static void main(String[] args) {
		Bike bike= new Bike();
		
		Friend1 friend1= new Friend1(bike);
		friend1.setName("Ram");
		
		Friend2 friend2= new Friend2(bike);
		friend2.setName("Sham");
		
		friend1.start();
		friend2.start();
		
	}

}
