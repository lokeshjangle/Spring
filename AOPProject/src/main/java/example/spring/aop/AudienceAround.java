package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect  //Marks this class as an aspect class/Target class
public class AudienceAround { //Aspect Class


    @Pointcut("execution(* example.spring.aop.*.perform(..))")
    private void myPointCut(){}


    private void takeSeats(){System.out.println("Please take your seats from Around");}

    private void turnOffMobile(){System.out.println("Please turn off your mobile from Around");}

    private void clap(){System.out.println("Clap clap clap from Around");}

    private void demandForRefund(){System.out.println("Please give my money back from Around");}

    private void leave(){System.out.println("Bye bye,leaving now from Around");}

    @Around("myPointCut()")
    public void monitorPerformance(ProceedingJoinPoint joinPoint){
        takeSeats();
        turnOffMobile();
        //Invoke Target Method
        try {
            joinPoint.proceed();
            clap(); //Invoke this method if performance is successeful
        } catch (Throwable e) {
            demandForRefund();//Invoke this method if performance is failed
        }
        finally {  //Always executed if anything is happen in try-catch block it always calle
            leave();

        }
    }
}
