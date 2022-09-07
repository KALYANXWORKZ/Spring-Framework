package com.xworkz.powder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cream {
	@Value("20")
	private int id;
	@Value("Loreal")
	private String brand;
	@Value("300.50")
	private double price;

	@Override
	public String toString() {
		return "Cream [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}
