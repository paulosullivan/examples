package com.posullivan.rest.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(setterVisibility=Visibility.PUBLIC_ONLY)
public class Vehicle {
	
	private Long id;

	private String make;

	private String model;

	private String year;

	// The transaction will contain the real price
	private Integer guidePrice;
	
	private List<Transaction> transactions;
	
	public Vehicle() {
	}

	public Vehicle(String make, String model, String year, Integer guidePrice, List<Transaction> transactions) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.guidePrice = guidePrice;
		this.transactions = transactions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getGuidePrice() {
		return guidePrice;
	}

	public void setGuidePrice(Integer guidePrice) {
		this.guidePrice = guidePrice;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
