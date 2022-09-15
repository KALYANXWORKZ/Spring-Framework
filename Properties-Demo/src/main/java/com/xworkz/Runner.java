package com.xworkz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println(context);
		
		PropertiesDemo demo = context.getBean(PropertiesDemo.class);
		String string = demo.toString();
		System.out.println(string);
	}

}
