package com.jspiders.springcorexml.bean;

import java.util.List;

import lombok.Data;

@Data
public class StudentBean2 {       // this student bean class is for many to many xml config
	int id;
	String name;
	String email;
	String address;
	List<SubjectBean> subjects;
}
