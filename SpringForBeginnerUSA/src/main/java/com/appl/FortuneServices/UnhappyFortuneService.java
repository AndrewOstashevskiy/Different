package com.appl.FortuneServices;

import com.appl.SportInterface.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class UnhappyFortuneService implements FortuneService {
    public String getFortune() {
        return "It doesn't your day";
    }
}
