package com.xworkz.powder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PowderRunner {

	public static void main(String[] args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean created");
		Powder powder = Context.getBean(Powder.class);
		System.out.println(powder);

	}

}

/*Console/Output
 * bean created 
 * Powder [id=10, brand=Nivea, price=250.0, cream=Cream [id=20,brand=Loreal, price=300.5]]
 * 
 */
