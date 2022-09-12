package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class BasketBallRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BasketBall ball = context.getBean(BasketBall.class);
		System.out.println(ball);

	}

}

/* CONSOLE/OUTPUT
 *  BasketBall [id=101, name=Vicky, price=500.5] */
 