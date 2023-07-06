package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AadharDTO {
	@Id
	private int id;
	private long aadhar_no;
	private String doi;
	
	
	//...........for bidirectional ( it will create intermediate table ).................
	@OneToOne
	private PersonDTO person;

}
