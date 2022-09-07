package com.xworkz.powder.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Powder1 {
	@Value("201")
	private int id;
	@Value("Johnson")
	private String brand;
	@Value("100.50")
	private double price;

	@Override
	public String toString() {
		return "Powder1 [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}
