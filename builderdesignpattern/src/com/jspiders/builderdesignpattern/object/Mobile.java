package com.jspiders.builderdesignpattern.object;

public class Mobile {
	private String brand;
	private String model;
	private String colour;
	private double price;
	private int ram;
	private int momory;
	private String os;
	private double disp_size;
	private int disp_res;
	private int front_cam;
	private int rear_cam;
	
	
	public Mobile(String brand, String model, String colour, double price, int ram, int momory, String os,
			double disp_size, int disp_res, int front_cam, int rear_cam) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.ram = ram;
		this.momory = momory;
		this.os = os;
		this.disp_size = disp_size;
		this.disp_res = disp_res;
		this.front_cam = front_cam;
		this.rear_cam = rear_cam;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", colour=" + colour + ", price=" + price + ", ram="
				+ ram + ", momory=" + momory + ", os=" + os + ", disp_size=" + disp_size + ", disp_res=" + disp_res
				+ ", front_cam=" + front_cam + ", rear_cam=" + rear_cam + "]";
	}
	
}
