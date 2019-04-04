package com.appl.FortuneServices;

import com.appl.SportInterface.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "Lucky Day";
    }

}
