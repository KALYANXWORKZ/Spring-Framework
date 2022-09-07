package com.xworkz.powder.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PowderTester1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean loaded");
		Powder1 bean = context.getBean(Powder1.class);
		System.out.println(bean);

	}

}

/* Console/Output
 * bean loaded 
 * 
 * Powder1 [id=201, brand=Johnson, price=100.5]
 */
