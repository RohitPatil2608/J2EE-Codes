package com.jspiders.multithreading.resources;

public class Shop {
	int availableProducts;
	public Shop(int availableProducts) {
		this.availableProducts=availableProducts;
	}
	public synchronized void OrderProducts(int noOfProducts) {
		System.out.println("Trying to purchase"+ noOfProducts+"products");
		if(noOfProducts>availableProducts) {
			System.out.println(noOfProducts+"Products not available...");
			System.out.println("please wait...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableProducts-=noOfProducts;
	    System.out.println(noOfProducts + "products purchased");
	    System.out.println("Now available products:"+ availableProducts);
	}
	
	public synchronized void restockProducts(int noOfProducts) {
		System.out.println("Restocking"+ noOfProducts+ "products");
		availableProducts+=noOfProducts;
		System.out.println("now available products: "+ availableProducts);
		this.notify();
	}

}
