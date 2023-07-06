package com.jspiders.multithreading.resources;

public class Mobile {
	int charging;
	public Mobile (int charging) {
		this.charging=charging;
	}
	public synchronized void batteryCharging(int noOfChargingPercentage) {
		System.out.println("trying to play game");
		if(noOfChargingPercentage<charging) {
			System.out.println("low battery to play game..please charge mobile");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		charging-=noOfChargingPercentage;
		System.out.println("Now playing a game");
		System.out.println("available charging is:"+ charging+"%");
		
	}
	public synchronized void chargingMobile(int noOfChargingPercentage) {
		System.out.println("charging your mobile");
		charging+=noOfChargingPercentage;
		System.out.println("mobile having"+charging+"%");
		this.notifyAll();
		
	}

}
