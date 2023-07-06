//package com.jspiders.springcoreannotations.config;
//
//import org.springframework.context.annotation.Bean;
//
//import com.jspiders.springcoreannotations.beans.StudentBean;
//
//public class StudentConfig {
//	@Bean ("student1")
//	public StudentBean getBean() {
//		StudentBean student = new StudentBean();
//		student.setId(1);
//		student.setName("Ram");
//		student.setEmail("ram@gmail.com");
//		return student;
//	}
//}




//.........................for @Value annotation............................

//package com.jspiders.springcoreannotations.config;
//
//import org.springframework.context.annotation.Bean;
//
//import com.jspiders.springcoreannotations.beans.StudentBean;
//
//public class StudentConfig {
//	@Bean ("student1")
//	public StudentBean getBean() {
//		return new StudentBean();
//	}
//}




//....................for AllArgsConstructor & NoArgsConstructor.......................

package com.jspiders.springcoreannotations.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotations.beans.StudentBean;

public class StudentConfig {
	@Bean ("student1")
	public StudentBean getBean() {
		return new StudentBean(1, "Ram", "ram@gmail.com");
	}
}
