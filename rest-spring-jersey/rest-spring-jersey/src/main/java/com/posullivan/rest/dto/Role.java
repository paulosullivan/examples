package com.posullivan.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Role {
	
	MANAGER("Manager"),
	SALES_PERSON("Sales Person");
	
	private String type;
	
	private Role(String type) {
		this.type = type;
	}
	
	

}
