package com.xworkz.powder.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Powder {

	private int id;
	private String brand;
	private double price;

	public int getId() {
		return id;
	}
    @Value("101")
	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}
    @Value("Ponds")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
    @Value("150.50")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Powder [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
