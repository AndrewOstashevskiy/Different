package com.appl.FortuneServices;

import com.appl.SportInterface.FortuneService;
import org.springframework.stereotype.Component;


public class SadFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is a sed day";
    }
}
