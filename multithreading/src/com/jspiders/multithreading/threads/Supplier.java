package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Shop;

public class Supplier extends Thread {
	Shop shop;
	public Supplier(Shop shop) {
		this.shop=shop;
	}
	@Override
	public void run() {
		shop.restockProducts(10);
	}

}
