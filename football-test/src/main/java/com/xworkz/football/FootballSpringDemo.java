package com.xworkz.football;

public class FootballSpringDemo {

	public String brand;
	public Boolean isAirFilled;
	public Double price;

//	public FootballSpringDemo() {
//
//		System.out.println(this.getClass().getSimpleName() + " Bean has been Created");
//
//	}

	public FootballSpringDemo(String brand) {
		super();
		this.brand = brand;
	}

	public FootballSpringDemo(String brand, Boolean isAirFilled) {
		super();
		this.brand = brand;
		this.isAirFilled = isAirFilled;
	}

	public FootballSpringDemo(String brand, Boolean isAirFilled, Double price) {
		super();
		this.brand = brand;
		this.isAirFilled = isAirFilled;
		this.price = price;
	}

}
