package com.xworkz;

public class Tv {
	
	private String brand;
	private String id;
	private String color;
	
	private TvDisplay display;
	private TvRemote remote;
	private TvSetUpBox setUpBox;
	private TvStand stand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setDisplay(TvDisplay display) {
		this.display = display;
	}
	
	public void setRemote(TvRemote remote) {
		this.remote = remote;
	}
	
	public void setSetUpBox(TvSetUpBox setUpBox) {
		this.setUpBox = setUpBox;
	}
	
	public void setStand(TvStand stand) {
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", id=" + id + ", color=" + color + ", display=" + display + ", remote=" + remote
				+ ", setUpBox=" + setUpBox + ", stand=" + stand + "]";
	}
	
	
	
	

}
