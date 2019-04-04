package com.appl.FortuneServices;

import com.appl.SportInterface.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class AnotherSheet implements FortuneService {
    public String getFortune() {
        return "I do not know...";
    }
}
