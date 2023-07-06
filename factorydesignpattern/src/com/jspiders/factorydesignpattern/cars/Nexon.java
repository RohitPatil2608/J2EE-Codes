package com.jspiders.factorydesignpattern.cars;

import com.jspiders.factorydesignpattern.inter.Car;

public class Nexon implements Car{
	@Override
	public void buyCar() {
		System.out.println("Bought Nexon..!!");
		
	}
}
