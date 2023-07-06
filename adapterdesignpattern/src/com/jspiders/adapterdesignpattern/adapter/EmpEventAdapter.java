package com.jspiders.adapterdesignpattern.adapter;

import com.jspiders.adapterdesignpattern.entity.Employee;
import com.jspiders.adapterdesignpattern.entity.Event;

public class EmpEventAdapter extends Employee implements Event{

	@Override
	public void womensDay() {
		System.out.println("Chief guest of event is : " + this.name);
		System.out.println("Her designation is : " + this.designation);
	}
	
}
