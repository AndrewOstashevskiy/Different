package com.appl.Config;

import com.appl.Coaches.SwimCoach;
import com.appl.FortuneServices.HappyFortuneService;
import com.appl.FortuneServices.SadFortuneService;
import com.appl.SportInterface.Coach;
import com.appl.SportInterface.FortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.appl")
@PropertySource("classpath:sport.properties")
public class ContainerConfigAddress {

    /**
     * Bean for fortuneService
     */
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    /**
     * Bean for Coach or:
     *
     * @Bean
     *     public Coach swimCoach(@Qualifier("sadFortuneService") FortuneService fortuneService){
     *         SwimCoach swimCoach = new SwimCoach(fortuneService);
     *         return swimCoach;
     */
    @Bean
    public Coach swimCoach(){
        SwimCoach swimCoach = new SwimCoach(sadFortuneService());
        return swimCoach;
    }
}
