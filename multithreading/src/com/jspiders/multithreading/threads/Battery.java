package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Mobile;

public class Battery extends Thread{
	Mobile  mobile;
	public Battery(Mobile mobile) {
		this.mobile=mobile;
		
	}
	@Override
	public void run() {
		mobile.batteryCharging(10);
	}
	

}
