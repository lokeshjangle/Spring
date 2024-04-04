package example.spring.core.main;

import example.spring.core.HelloService;
import example.spring.core.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExampleMain {
	public static void main(String[] args) {
		ApplicationContext ctx;

		/*
		 * String configPath = "./src/main/resources/spring-config.xml"; //Relative Path
		 * //configPath = "c:/myfiles/spring-config.xml --> Absolute path ctx = new
		 * FileSystemXmlApplicationContext(configPath); Object obj =
		 * ctx.getBean("myBean"); //Requesting Spring to get the Bean whose ID is myBean
		 * WelcomeService gs = (WelcomeService) obj; String reply = gs.sayGreeting();
		 * System.out.println(reply);
		 */

		
		String configPath = "spring-config.xml"; 
		  ctx = new ClassPathXmlApplicationContext(configPath); 
		  Object obj = ctx.getBean("myBean"); //Requesting Spring to get the Bean whose ID is myBean
		  WelcomeService gs = (WelcomeService) obj; 
		  String reply = gs.sayGreeting();
		  System.out.println(reply);
		  
		  
		  obj = ctx.getBean("myBean2"); //Requesting Spring to get the Bean whose ID is myBean
		  HelloService gs1 = (HelloService) obj; 
		  reply = gs1.sayGreeting();
		  System.out.println(reply);
		 
	}
}
