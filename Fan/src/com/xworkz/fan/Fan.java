package com.xworkz.fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fan {

	private String brand;

	private int id;

	private int noOfWings;

	private Power power;

	public Fan(@Value("Havels") String brand, @Value("10") int id, @Value("3") int noOfWings, @Autowired Power power) {
		super();
		this.brand = brand;
		this.id = id;
		this.noOfWings = noOfWings;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", id=" + id + ", noOfWings=" + noOfWings + ", power=" + power + "]";
	}

}
