package com.jspiders.springbootstudentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.springbootstudentmanagement.POJO.StudentPOJO;

public interface StudentRepository extends JpaRepository<StudentPOJO, Integer> {
	
	StudentPOJO findByName(String name);

	StudentPOJO findByAddress(String address);
}
