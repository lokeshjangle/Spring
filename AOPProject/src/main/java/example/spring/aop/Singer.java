package example.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Singer {
    public void perform() throws  RuntimeException{ //Target Class
        System.out.println("Singing a song.....");
        throw  new RuntimeException();

    }
}
