package com.xworkz.cookingoil.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cookingoil")
public class CookingOilEntity {
	@Id
	private int id;
	private String brand;
	private double price;
	private String color;
	private String type;
	private String madeIn;
	private String createdBy;
	private LocalDate createDate;
	private String updatedBy;
	private LocalDate updateDate;
	private LocalDate expireDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public CookingOilEntity( String brand, double price, String color, String type, String madeIn, String createdBy,
			LocalDate createDate, String updatedBy, LocalDate updateDate, LocalDate expireDate) {
		super();
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
		this.madeIn = madeIn;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
		this.expireDate = expireDate;
	}

	public CookingOilEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CookingOil [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", madeIn=" + madeIn + ", createdBy=" + createdBy + ", createDate=" + createDate + ", updatedBy="
				+ updatedBy + ", updateDate=" + updateDate + ", expireDate=" + expireDate + "]";
	}

}
