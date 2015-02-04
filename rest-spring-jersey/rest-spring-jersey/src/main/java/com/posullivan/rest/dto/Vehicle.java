package com.posullivan.rest.dto;

import java.util.List;

import org.joda.money.Money;

import lombok.Data;

@Data
public class Vehicle {

	private String make;

	private String model;

	private String year;

	// The transaction will contain the real price
	private Money guidePrice;
	
	private List<Transaction> transactions;
}
