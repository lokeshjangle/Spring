package example.spring.aop.main;

import example.spring.aop.Musician;
import example.spring.aop.Singer;
import example.spring.aop.SprintAopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPExampleMain {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SprintAopConfig.class);
        Musician musicianObj = annoCtx.getBean(Musician.class);
        System.out.println(annoCtx.getClass().getName());
        musicianObj.perform();

        System.out.println("----------------------------------");
        Singer singerObj = annoCtx.getBean(Singer.class);
        System.out.println(annoCtx.getClass().getName());
        singerObj.perform();
    }
}
