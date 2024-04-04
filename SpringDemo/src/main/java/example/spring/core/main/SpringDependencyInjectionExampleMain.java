package example.spring.core.main;

import example.spring.core.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyInjectionExampleMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Object obj = ctx.getBean("usBean");
        GreetingService gs = (GreetingService) obj;
        String reply = gs.sayGreeting();
        System.out.println(reply);

        System.out.println("--------------------");
        obj = ctx.getBean("usBean2");
        gs = (GreetingService) obj;
        reply = gs.sayGreeting();
        System.out.println(reply);

        System.out.println("--------------------");
        obj = ctx.getBean("usBean3");
        gs = (GreetingService) obj;
        reply = gs.sayGreeting();
        System.out.println(reply);

        System.out.println("--------------------");
        obj = ctx.getBean("custBean");
        System.out.println(obj);
        
    }
}
