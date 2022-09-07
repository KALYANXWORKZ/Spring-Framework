package com.xworkz.powder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Powder {
	@Value("10")
	private int id;
	@Value("Nivea")
	private String brand;
	@Value("250.00")
	private double price;
	@Autowired()
	private Cream cream;
	@Override
	public String toString() {
		return "Powder [id=" + id + ", brand=" + brand + ", price=" + price + ", cream=" + cream + "]";
	}

	
	
}
