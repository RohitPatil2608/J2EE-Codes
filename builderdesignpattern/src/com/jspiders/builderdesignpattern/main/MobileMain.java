package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.builder.MobileBuilder;
import com.jspiders.builderdesignpattern.object.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new MobileBuilder().brand("Samsung").model("S23").momory(256).colour("black").getMobile();
		System.out.println(mobile);
	}
}
