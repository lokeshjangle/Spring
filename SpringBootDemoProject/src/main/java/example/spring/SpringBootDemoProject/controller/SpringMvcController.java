package example.spring.SpringBootDemoProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Marks this class as a Spring MVC Controller
public class SpringMvcController {
	
	@RequestMapping("/showIndex")  //Mapping with UrL
	public String getIndexPageName() {
		String indexPageName = "index";
		return indexPageName;
	}

}
