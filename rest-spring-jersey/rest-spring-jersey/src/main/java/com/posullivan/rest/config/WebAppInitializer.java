package com.posullivan.rest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext ctx) throws ServletException {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);

		// Manage the lifecycle of the root application context
		ctx.addListener(new ContextLoaderListener(rootContext));

		// Register and map any servlets
		ServletRegistration.Dynamic jerseyServlet = ctx.addServlet("JerseyServlet", new ServletContainer());
		jerseyServlet.setLoadOnStartup(1);
		jerseyServlet.addMapping("/*");
		jerseyServlet.setInitParameter("javax.ws.rs.Application", "com.posullivan.rest.config.JerseyApplication");
	}

}
