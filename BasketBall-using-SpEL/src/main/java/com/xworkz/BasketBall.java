package com.xworkz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketBall {
@Value("${id1}")
	private int id;
	@Value("${name1}")
	private String name;
	@Value("${price1}")
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BasketBall [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
