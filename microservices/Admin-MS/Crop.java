package com.cropdeal.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Crop {
	@Id
	private int id;
	private String CropName;
	private double price;
	
	
	
	public Crop() {
		super();
	
	}

	public Crop(int id, String cropName, double price) {
		super();
		this.id = id;
		CropName = cropName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCropName() {
		return CropName;
	}

	public void setCropName(String cropName) {
		CropName = cropName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Crop [id=" + id + ", CropName=" + CropName + ", price=" + price + "]";
	}
	
	

}
