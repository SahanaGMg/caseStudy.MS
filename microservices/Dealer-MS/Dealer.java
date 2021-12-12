package com.cropdeal.dealer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Dealer")
public class Dealer {
	
	@Id
	private int id;
	private String dealerUserName;
	private String dealerName;
	private String dealerEmail;
	private long dealerPhoneno;
	private String dealerPassword;
	
	public Dealer(int id, String dealerUserName, String dealerName, String dealerEmail, long dealerPhoneno,
			String dealerPassword) {
		super();
		this.id = id;
		this.dealerUserName = dealerUserName;
		this.dealerName = dealerName;
		this.dealerEmail = dealerEmail;
		this.dealerPhoneno = dealerPhoneno;
		this.dealerPassword = dealerPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDealerUserName() {
		return dealerUserName;
	}

	public void setDealerUserName(String dealerUserName) {
		this.dealerUserName = dealerUserName;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerEmail() {
		return dealerEmail;
	}

	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}

	public long getDealerPhoneno() {
		return dealerPhoneno;
	}

	public void setDealerPhoneno(long dealerPhoneno) {
		this.dealerPhoneno = dealerPhoneno;
	}

	public String getDealerPassword() {
		return dealerPassword;
	}

	public void setDealerPassword(String dealerPassword) {
		this.dealerPassword = dealerPassword;
	}

	@Override
	public String toString() {
		return "Dealer [id=" + id + ", dealerUserName=" + dealerUserName + ", dealerName=" + dealerName
				+ ", dealerEmail=" + dealerEmail + ", dealerPhoneno=" + dealerPhoneno + ", dealerPassword="
				+ dealerPassword + "]";
	}
	
	

	

}
