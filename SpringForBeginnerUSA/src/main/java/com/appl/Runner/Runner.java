package com.appl.Runner;

import com.appl.Coaches.SwimCoach;
import com.appl.Coaches.TennisCoach;
import com.appl.Config.ContainerConfigAddress;
import com.appl.Config.ContainerConfigFile;
import com.appl.SportInterface.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {

        /**
         * Scanning by xml
         */
    /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");*/
        /**
         * Scanning by AnnotationConfig
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContainerConfigFile.class);
        SwimCoach swimCoach = (SwimCoach) context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getDailyWork());

        System.out.println(swimCoach.getTeam()+"\n"+swimCoach.getEmail());



        context.close();
    }

}
