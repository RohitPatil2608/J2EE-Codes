package com.jspiders.adapterdesignpattern.main;

import com.jspiders.adapterdesignpattern.adapter.EmpEventAdapter;

public class AdapterMain {
	public static void main(String[] args) {
		EmpEventAdapter adapter=new EmpEventAdapter();
		adapter.id=1;
		adapter.name="Sara";
		adapter.email="sara@gmail.com";
		adapter.contact=9876543210L;
		adapter.designation="Developer";
		adapter.womensDay();
	}
}
