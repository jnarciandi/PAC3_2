package com.medAdmin.PAC3_2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicaments")
public class Medicament {
	@Id
	private int medicamentID;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="description")
	private String description;
	@Column(name="producer")
	private String producer;
	@Column(name="category")
	private String category;
	@Column(name="stockquantity")
	private int stockQuantity;
	@Column(name="stockinorder")
	private int stockInOrder;
	@Column(name="active")
	private boolean active;
	
	public Medicament() {
		super();
	}
	
	public Medicament(int medicamentID, String name, double price) {
		
		this.name = name;
		this.medicamentID = medicamentID;
		this.price = price;
		
	}
	
	public Medicament(int medicamentID) {
		super();
		this.medicamentID = medicamentID;
		
	}

	
	public int getMedicamentID() {
		return medicamentID;
	}

	public void setMedicamentID(int medicamentID) {
		this.medicamentID = medicamentID;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public int getStockInOrder() {
		return stockInOrder;
	}

	public void setStockInOrder(int stockInOrder) {
		this.stockInOrder = stockInOrder;
	}

	public boolean isActive() {
		return active;
	}
	
	public String isActiveS() {
		return String.valueOf(active);
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	

	@Override
	public String toString() {
		return "Medicament [medicamentID=" + medicamentID + ", name=" + name + ", price=" + price + ", description="
				+ description + ", producer=" + producer + ", category=" + category + ", stockQuantity=" + stockQuantity
				+ ", stockInOrder=" + stockInOrder + ", active=" + active + "]";
	}

}
