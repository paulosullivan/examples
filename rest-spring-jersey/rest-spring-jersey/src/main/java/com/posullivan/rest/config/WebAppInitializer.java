package com.posullivan.rest.config;

/*
public class WebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext ctx) throws ServletException {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);

		// Manage the lifecycle of the root application context
		ctx.addListener(new ContextLoaderListener(rootContext));
		
		ctx.addListener(new RequestContextListener());

		// Register and map any servlets
		ServletRegistration.Dynamic jerseyServlet = ctx.addServlet("JerseyServlet", new ServletContainer());
		jerseyServlet.setLoadOnStartup(0);
		jerseyServlet.addMapping("/rest-spring-jersey/*");
		jerseyServlet.setInitParameter("javax.ws.rs.Application", "com.posullivan.rest.config.JerseyApplication");
		jerseyServlet.setInitParameter("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
		jerseyServlet.setInitParameter("contextConfigLocation", "com.posullivan.rest.config.AppConfig");
		
		
		ServletRegistration.Dynamic testAppStatusServlet = ctx.addServlet("testAppStatusServlet", TestAppStatusServlet.class);
		testAppStatusServlet.setLoadOnStartup(1);
		testAppStatusServlet.addMapping("/testAppStatus");
	}

}
*/

