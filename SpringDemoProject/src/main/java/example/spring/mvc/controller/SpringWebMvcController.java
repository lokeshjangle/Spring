package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller
public class SpringWebMvcController {

	@RequestMapping("/showIndex")
	public String getIndexPageName() {
		String indexPageName = "index";
		return indexPageName;
	}
	
	@RequestMapping("/login")
	public String getLogin() {
		String loginPage = "Login";
		return loginPage;
	}
	
	//Result page after user validation
	@RequestMapping(value="/doValidate", method=RequestMethod.POST)
	//Configure this end point handle HTTP POST request
	public String getResultPageAfterUserValidation(@RequestParam("user_name") String uid,@RequestParam("user_pwd") String pwd) {
		
		
		//Populating the model object: User based upon uid and pwd
		User userModel = new User(uid,pwd);
		
		//Passing this model object to another model to userValidator to validate this user
		String resultPageName = "failure";
		boolean valid = UserValidator.isValid(userModel);
		
		if(valid) {resultPageName = "success";}
		
		return resultPageName;
	}
	
	@RequestMapping("/success")
	public String getSuccess() {
		return "success";
	}
	
	@RequestMapping("/failure")
	public String getFailure() {
		return "failure";
	}
	
}
