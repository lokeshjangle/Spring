package example.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Musician {
    public void perform(){  //Target Class
        System.out.println("Playing a guitar.........");
    }
}
