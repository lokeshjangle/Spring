package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		//This is accessible to anyone,No authentication requires
		return "Hello World";
	}
	
	@GetMapping("/regular-work")
	public String doRegularWork() {
		//This is accessible to regular user as well as administrators. It requires authentication
		return "Regular user doing some regular work";
		
	}
	
	@GetMapping("admin-work")
	public String doAdminWork() {
		//This is accessible to only administration. It requires not only authentication but also authorization 
		return "Admin user doing some administration work";
	}
}
