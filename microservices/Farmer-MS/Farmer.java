package com.cropdeal.farmer.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Farmer")
public class Farmer {
	@Id
	private int id;
	private String farmerUsername;
	private String farmerName;
	private String farmerEmail;
	private int farmerContactNo;
	private String farmerPassword;
	
	
	public Farmer(int id, String farmerUsername, String farmerName, String farmerEmail, int farmerContactNo,
			String farmerPassword) {
		super();
		this.id = id;
		this.farmerUsername = farmerUsername;
		this.farmerName = farmerName;
		this.farmerEmail = farmerEmail;
		this.farmerContactNo = farmerContactNo;
		this.farmerPassword = farmerPassword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFarmerUsername() {
		return farmerUsername;
	}


	public void setFarmerUsername(String farmerUsername) {
		this.farmerUsername = farmerUsername;
	}


	public String getFarmerName() {
		return farmerName;
	}


	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}


	public String getFarmerEmail() {
		return farmerEmail;
	}


	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}


	public int getFarmerContactNo() {
		return farmerContactNo;
	}


	public void setFarmerContactNo(int farmerContactNo) {
		this.farmerContactNo = farmerContactNo;
	}


	public String getFarmerPassword() {
		return farmerPassword;
	}


	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}


	@Override
	public String toString() {
		return "FarmerUser [Id=" + id + ", farmerUsername=" + farmerUsername + ", farmerName=" + farmerName
				+ ", farmerEmail=" + farmerEmail + ", farmerContactNo=" + farmerContactNo + ", farmerPassword=" + farmerPassword + "]";
	
	}
	
	

}