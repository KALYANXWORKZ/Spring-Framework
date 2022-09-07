package com.xworkz.powder.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class PowderTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean loaded");
		Powder powder = context.getBean(Powder.class);
		System.out.println(powder);

	}

}

/*Console/Output
 * 
 * bean loaded  
 * 
 * Powder [id=101, brand=Ponds, price=150.5]
 */
