//package com.jspiders.springcoreannotations.beans;
//
//import lombok.Data;
//
//@Data
//public class StudentBean {
//	int id;
//	String name;
//	String email;
//}






//.........................use of @Value annotation............................

//package com.jspiders.springcoreannotations.beans;
//
//import org.springframework.beans.factory.annotation.Value;
//
//import lombok.Data;
//
//@Data
//public class StudentBean {
//	@Value("1")
//	int id;
//	@Value("Ram")
//	String name;
//	@Value("ram@gmail.com")
//	String email;
//}



//....................@AllArgsConstructor......................
//....................@NoArgsConstructor.......................

package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {
	
	int id;
	String name;
	String email;
}
