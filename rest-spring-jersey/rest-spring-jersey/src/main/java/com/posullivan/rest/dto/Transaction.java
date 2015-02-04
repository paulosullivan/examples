package com.posullivan.rest.dto;

import org.joda.money.Money;
import org.joda.time.LocalDate;

import lombok.Data;

@Data
public class Transaction {

	private LocalDate date;
	
	private Money price;
	
	private String type;
	
	private Vehicle vehicle;
	
	private Customer customer;
	
	private SalesPerson salesPerson;
}
