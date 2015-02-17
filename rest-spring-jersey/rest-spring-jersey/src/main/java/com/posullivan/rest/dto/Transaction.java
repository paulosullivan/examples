package com.posullivan.rest.dto;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.posullivan.rest.date.JodaLocalDateDeserializer;
import com.posullivan.rest.date.JodaLocalDateSerializer;

@JsonAutoDetect(setterVisibility=Visibility.PUBLIC_ONLY)
public class Transaction {

	private LocalDate date;
	
	private Integer price;
	
	private String type;
	
	private Vehicle vehicle;
	
	private Customer customer;
	
	private Employee salesPerson;

	@JsonSerialize(using = JodaLocalDateSerializer.class)
	public LocalDate getDate() {
		return date;
	}

	@JsonDeserialize(using = JodaLocalDateDeserializer.class)
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(Employee salesPerson) {
		this.salesPerson = salesPerson;
	}
	
}
