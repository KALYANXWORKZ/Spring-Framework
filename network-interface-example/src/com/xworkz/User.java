package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean xml file loaded");
		Airtel air = context.getBean("user1", Airtel.class);
		air.activateService();

		Airtel air1 = context.getBean("user2", Airtel.class);
		air1.activateService();

		Airtel air2 = context.getBean("user3", Airtel.class);
		air2.activateService();

	}

}

/* console/output
 * bean xml file loaded
 * Missed Call Alert Service Activated 
 * Hello Tune Service Activated 
 * Data Pack Service Activated
 */
