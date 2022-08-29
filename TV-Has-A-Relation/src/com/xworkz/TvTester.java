package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Tv tv = context.getBean(Tv.class);
		System.out.println(tv);

		TvDisplay display = context.getBean(TvDisplay.class);
		System.out.println(display);

		TvRemote tr = context.getBean(TvRemote.class);
		System.out.println(tr);

		TvStand ts = context.getBean(TvStand.class);
		System.out.println(ts);

		TvSetUpBox tsb = context.getBean(TvSetUpBox.class);
		System.out.println(tsb);
	}

}
