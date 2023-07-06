package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Bike;

public class Friend1 extends Thread{
	Bike bike;
	
	public Friend1 (Bike bike) {
		super();
		this.bike=bike;	
	}
	
	@Override
	public void run() {
		synchronized (bike.resource1) {
			System.out.println(this.getName()+ " has been taken "+ bike.resource1);
			synchronized (bike.resource2) {
				System.out.println(this.getName()+ " has been taken "+ bike.resource2);	
			}
			System.out.println(this.getName()+ " has been given to "+ bike.resource2);
		}
		System.out.println(this.getName()+ " has been given to "+ bike.resource1);
	}
}
