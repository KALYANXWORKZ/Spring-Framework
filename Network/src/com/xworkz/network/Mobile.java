package com.xworkz.network;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean(Sim.class);
		sim.calling();
		sim.data();
	}

}
/* output
 * 
 * calling using vodaphone sim 
 * browsing internet using vodaphone sim
 */
