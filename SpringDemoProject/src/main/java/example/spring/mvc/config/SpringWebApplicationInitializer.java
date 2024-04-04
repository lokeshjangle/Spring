package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {

	private WebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.setConfigLocations("example");
		return ctx;
		
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext webCtx = getContext();
		
		DispatcherServlet frontController = new DispatcherServlet(webCtx);
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("frontController", frontController);
		
		dispatcher.addMapping("/");

	}

}
