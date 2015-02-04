package com.posullivan.rest.dto;
import lombok.Data;

@Data
public class Customer {
	
	// Lombok doesn't support inheritance so using composition instead
	private UserDetail userDetail;
	
	private String phone;
	
}
