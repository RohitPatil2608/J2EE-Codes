package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.StudentBean2;
import com.jspiders.springcorexml.bean.SubjectBean;

public class SubjectMain {
	public static void main(String[] args) {
		ApplicationContext context1=new ClassPathXmlApplicationContext("StudentBean2.xml");
	
		StudentBean2 student1 = (StudentBean2)context1.getBean("student1");
		StudentBean2 student2 = (StudentBean2)context1.getBean("student2");
		
		System.out.println(student1);
		System.out.println(student2);
	
		((ClassPathXmlApplicationContext) context1).close();
		
	}
}
