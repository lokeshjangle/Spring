package example.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@Aspect  //Marks this class as an aspect class/Target class
public class Audience { //Aspect Class


    @Pointcut("execution(* example.spring.aop.*.perform(..))")
    private void myPointCut(){}
    @Before("myPointCut()")
    public void takeSeats(){System.out.println("Please take your seats");}

    @Before("myPointCut()")
    public void turnOffMobile(){System.out.println("Please turn off your mobile");}

    @AfterReturning("myPointCut()")
    public void clap(){System.out.println("Clap clap clap");}

    @AfterThrowing("myPointCut()")
    public void demandForRefund(){System.out.println("Please give my money back");}

    @After("myPointCut()")
    public void leave(){System.out.println("Bye bye,leaving now");}
}
