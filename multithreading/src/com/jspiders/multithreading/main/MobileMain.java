package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resources.Mobile;
import com.jspiders.multithreading.threads.Battery;
import com.jspiders.multithreading.threads.Charger;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile=new Mobile(20);
		Battery battery=new Battery(mobile);
		Charger charger=new Charger(mobile);
		
		battery.start();
		charger.start();
	}

}
