package example.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//WebMvcConfigurer it is a marker interface
@EnableWebMvc		//Enables WebMvcConfigurer to the CALLBACK mechanism
@Configuration
public class SpringWebMvcConfigurer implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/pages/";
		String suffix = ".jsp";
		
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(suffix);
		
		return viewResolver;
	}
	
}
