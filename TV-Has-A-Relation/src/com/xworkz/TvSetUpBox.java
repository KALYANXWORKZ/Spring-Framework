package com.xworkz;

public class TvSetUpBox {
	
	private String brand;
	private double price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TvSetUpBox [brand=" + brand + ", price=" + price + "]";
	}
	
	

}
