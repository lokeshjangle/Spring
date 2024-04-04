package example.spring.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Marks this class as a RestFul controller
public class SpringRestController {
    @RequestMapping("/showGreeting")  //Create endpoint of URL
    public String getGreetingMessage(){
        return "Wishing you all Merry Christmas";
    }

    @RequestMapping("/showMessage")
    public Message getMessage(){
        String to = "My Students";
        String from = "Lokesh Jangale";
        String content = "Merry Christmas and Happy New Year";
        Message msg = new Message(to,from,content);
        return  msg;
    }
    
    @RequestMapping("/show-messages")
    public Collection<Message> getMessages(){
    	Message m1 = new Message("Raavan","Ram","Let's have a WAR");
    	Message m2 = new Message("James","Jack","How are you?");
    	Message m3 = new Message("Robin","Ana","I am fine");
    	
    	Collection<Message> allMsgs = List.of(m1,m2,m3);
    	return allMsgs;
    	
    }
}
