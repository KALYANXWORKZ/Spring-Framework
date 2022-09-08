package com.xworkz.fan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class FanRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Fan fan = context.getBean(Fan.class);
		System.out.println(fan);

	}

}
