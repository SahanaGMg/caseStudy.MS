package com.cropdeal.crops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Crop")
public class Crop {
	@Id
	private int id;
	private String cropName;
	private String location;
	private String cropType;
	
	public Crop(int id, String cropName, String location, String cropType) {
		super();
		this.id = id;
		this.cropName = cropName;
		this.location = location;
		this.cropType = cropType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcropName() {
		return cropName;
	}

	public void setcropName(String cropName) {
		this.cropName = cropName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getcropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	@Override
	public String toString() {
		return "Crop [id=" + id + ", cropName=" + cropName + ", location=" + location + ", cropType=" + cropType + "]";
	}
	
	
	

	
	

	

	

}
