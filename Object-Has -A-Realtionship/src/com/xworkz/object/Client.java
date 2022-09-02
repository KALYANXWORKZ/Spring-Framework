package com.xworkz.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml file loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();

		AnotherStudent as = context.getBean("anotherStudent",AnotherStudent.class);
		as.startCheating();

	}

}

/* Console/output
 * MathCheat Class Constructor called 
 * xml file loaded 
 * Math cheat started 
 * Math cheat started
 */
