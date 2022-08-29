package com.xworkz.college;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = Context.getBean("student",Student.class);
		student.displayStudentInfo();
		
		Student student1 = Context.getBean("daya",Student.class);
		student1.displayStudentInfo();
	}
	/* output
	 * 
	 * Student name is Kalyankumar N and the id is 101 
	 * Student name is null and the id is 201
	 */

}
