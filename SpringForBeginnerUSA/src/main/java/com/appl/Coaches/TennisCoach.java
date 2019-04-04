package com.appl.Coaches;

import com.appl.SportInterface.Coach;
import com.appl.SportInterface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Creating beans with @Annotation
 */
@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneServices;

    @Autowired
    @Qualifier("unhappyFortuneService")
    private FortuneService unhappyFortuneServices;

    @Autowired
    @Qualifier("anotherSheet")
    private FortuneService anotherSheets;
   /* @Autowired
    public void setTennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;*/
    //}

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public TennisCoach() {
        System.out.println(">> TennisCoach: Inside default constructor");
    }

    @PostConstruct
    public void Init() {
        System.out.println(">> TennisCoach: Init method");
    }

    @PreDestroy
    public void Destroy() {
        System.out.println(">> TennisCoach: Destroy method");
    }


    public String getUluck() {
        return unhappyFortuneServices.getFortune();
    }

    public String getAnnotherSheet() {
        return anotherSheets.getFortune();
    }

    public String getDailyWork() {
        return "Kick work";
    }

    public String getDailyFortune() {

        return fortuneServices.getFortune();
    }


}
