package com.xworkz;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses="com.xworkz")
public class BeanConfig {
	
	@Bean
	public PropertyPlaceholderConfigurer createBean() {
		System.out.println("Invoked createBean()");
		
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocation("aaa.properties");
		return configurer;
	}
}
