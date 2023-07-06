package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class PersonBean {
	@Value("1")
	int id;
	@Value("Ram")
	String name;
	@Value("ram@gmail.com")
	String email;
	@Autowired
	AadharBean aadhar;
}
