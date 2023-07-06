package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Shop;

public class Customer extends Thread{
	Shop shop;
	public Customer(Shop shop) {
		this.shop=shop;
	}
	@Override
	public void run() {
		shop.OrderProducts(10);
	}
}
