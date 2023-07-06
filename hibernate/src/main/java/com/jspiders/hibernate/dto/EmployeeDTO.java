package com.jspiders.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "emp")
public class EmployeeDTO {
	@Id
	@Column(name = "empno")
	
	//@GeneratedValue(strategy = GenerationType.AUTO) (Uncomment this line to check use of @GeneratedValue annotation..!!)
	
	private int id;
	@Column(name = "ename")
	private String name;
	@Column(name = "job")
	private String designation;
	@Column(name = "sal")
	private int salary;

}


// @GeneratedValue annotation is used to enable hibernate to automatically generate values for the 
// annotated property based on pre-defined  strategies for value generation..!!