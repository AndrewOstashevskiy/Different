package com.appl.Runner;

import com.appl.Coaches.SwimCoach;
import com.appl.SportInterface.Coach;
import com.appl.Config.ContainerConfigAddress;
import com.appl.Coaches.TennisCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /**
         * Scanning by xml
         */
    /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");*/
        /**
         * Scanning by AnnotationConfig
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContainerConfigAddress.class);
        Coach tennisCoach = (TennisCoach) context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(tennisCoach.getDailyWork());

        TennisCoach tennisCoach1 = (TennisCoach) context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach1.getAnnotherSheet());
        System.out.println("-------------------------------------------");

        SwimCoach swiCoach = (SwimCoach) context.getBean("swimCoach", Coach.class);
        System.out.println(swiCoach.getDailyFortune());
        System.out.println(swiCoach.getDailyWork());


        context.close();
    }

}
