package com.xworkz;

public class TvStand {
	
	private int noOfLegs;
	private String color;
	
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TvStand [noOfLegs=" + noOfLegs + ", color=" + color + "]";
	}
	
	
	

}
