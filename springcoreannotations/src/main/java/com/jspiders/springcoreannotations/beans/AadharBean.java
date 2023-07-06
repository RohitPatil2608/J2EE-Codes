package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AadharBean {
	@Value("1")
	int id;
	@Value("778899445566")
	long aadhar_no;
	@Value("15-June-2015")
	String date_of_issue;
	
}
