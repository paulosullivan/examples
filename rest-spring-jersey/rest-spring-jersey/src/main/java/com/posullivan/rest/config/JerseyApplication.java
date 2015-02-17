package com.posullivan.rest.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.posullivan.rest.dto.resource.VehicleResource;

public class JerseyApplication extends ResourceConfig {

	public JerseyApplication() {
		register(VehicleResource.class);
	}
	
}
