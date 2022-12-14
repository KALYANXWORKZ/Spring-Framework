package com.xworkz.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean xml file loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();

		Student s = context.getBean("stu1", Student.class);
		s.cheating();

		Student s1 = context.getBean("stu2", Student.class);
		s1.cheating();

	}

}


/*
 * Console/Output 
 * 
 * bean xml file loaded 
 *  Java cheating started
 *  Math cheating started
 *  Science cheating started
 */
