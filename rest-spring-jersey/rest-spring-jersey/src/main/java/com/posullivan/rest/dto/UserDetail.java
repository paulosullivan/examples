package com.posullivan.rest.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserDetail {
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private List<Transaction> transactions;
	
}
