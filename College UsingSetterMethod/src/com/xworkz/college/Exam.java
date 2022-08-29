package com.xworkz.college;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

		Student student2 = context.getBean("daya", Student.class);
		student2.displayStudentInfo();
	}

}
/* output
 * 
 * Student name is : Kalyankumar N and the id is : 101
 *  Student name is : Dayananda G A and the id is : 201
 */
