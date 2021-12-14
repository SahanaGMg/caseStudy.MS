package com.cropdeal.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dealer {
	
	@Id
	private int id;
	private String DealerUserName;
	private String DealerName;
	private String DealerEmail;
	private long DealerPhoneno;
	private String DealerPassword;
	
	
	
	
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dealer(int id, String dealerUserName, String dealerName, String dealerEmail, long dealerPhoneno,
			String dealerPassword) {
		super();
		this.id = id;
		DealerUserName = dealerUserName;
		DealerName = dealerName;
		DealerEmail = dealerEmail;
		DealerPhoneno = dealerPhoneno;
		DealerPassword = dealerPassword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDealerUserName() {
		return DealerUserName;
	}


	public void setDealerUserName(String dealerUserName) {
		DealerUserName = dealerUserName;
	}


	public String getDealerName() {
		return DealerName;
	}


	public void setDealerName(String dealerName) {
		DealerName = dealerName;
	}


	public String getDealerEmail() {
		return DealerEmail;
	}


	public void setDealerEmail(String dealerEmail) {
		DealerEmail = dealerEmail;
	}


	public long getDealerPhoneno() {
		return DealerPhoneno;
	}


	public void setDealerPhoneno(long dealerPhoneno) {
		DealerPhoneno = dealerPhoneno;
	}


	public String getDealerPassword() {
		return DealerPassword;
	}


	public void setDealerPassword(String dealerPassword) {
		DealerPassword = dealerPassword;
	}


	@Override
	public String toString() {
		return "Dealer [id=" + id + ", DealerUserName=" + DealerUserName + ", DealerName=" + DealerName
				+ ", DealerEmail=" + DealerEmail + ", DealerPhoneno=" + DealerPhoneno + ", DealerPassword="
				+ DealerPassword + "]";
	}
	
	

}
