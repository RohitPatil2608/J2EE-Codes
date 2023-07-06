package com.jspiders.factorydesignpattern.main;

import java.util.Scanner;

import com.jspiders.factorydesignpattern.cars.Endevour;
import com.jspiders.factorydesignpattern.cars.Harrier;
import com.jspiders.factorydesignpattern.cars.HondaCity;
import com.jspiders.factorydesignpattern.cars.Nexon;
import com.jspiders.factorydesignpattern.cars.XUV700;
import com.jspiders.factorydesignpattern.inter.Car;

public class CarFactory {
	private static Car car;

	public static void main(String[] args) {
		try {
			factory().buyCar();
		} catch (NullPointerException e) {
			System.out.println("No car selected..!!");
		}
	}

	public static Car factory() {
		System.out.println("Car purchase options\n" + "1.Harrier\n" + "1.XUV700\n" + "1.Honda City\n" + "1.Endevour\n"
				+ "1.Nexon\n");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			car = new Harrier();
			break;

		case 2:
			car = new Endevour();
			break;

		case 3:
			car = new HondaCity();
			break;

		case 4:
			car = new XUV700();
			break;

		case 5:
			car = new Nexon();
			break;
		default:
			System.out.println("Invalid choice..!!");
			break;
		}

		scanner.close();
		return car;
	}
}
