package com.jspiders.factorydesignpattern.cars;

import com.jspiders.factorydesignpattern.inter.Car;

public class HondaCity implements Car{
	@Override
	public void buyCar() {
		System.out.println("Bought Honda City..!!");
		
	}
}
