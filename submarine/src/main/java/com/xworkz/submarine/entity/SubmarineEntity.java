package com.xworkz.submarine.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "submarine")
public class SubmarineEntity {
    @Id
	private int id;
	private String name;
	private String madeIn;
	private double price;
	private String createdBy;
	private LocalDate createDate;
	private String updatedBy;
	private LocalDate updateDate;

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

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public SubmarineEntity( String name, String madeIn, double price, String createdBy, LocalDate createDate,
			String updatedBy, LocalDate updateDate) {
		super();
		
		this.name = name;
		this.madeIn = madeIn;
		this.price = price;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
	}

	public SubmarineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubmarineEntity [id=" + id + ", name=" + name + ", madeIn=" + madeIn + ", price=" + price
				+ ", createdBy=" + createdBy + ", createDate=" + createDate + ", updatedBy=" + updatedBy
				+ ", updateDate=" + updateDate + "]";
	}

}
