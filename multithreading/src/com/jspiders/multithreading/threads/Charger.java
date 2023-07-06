package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Mobile;

public class Charger extends Thread {
	Mobile  mobile;
	public Charger(Mobile mobile) {
		this.mobile=mobile;
		
	}
	@Override
	public void run() {
		mobile.batteryCharging(10);
	}

}
