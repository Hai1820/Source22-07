package com.cyberlogitec.config;

import com.cyberlogitec.domain.Developer;
import com.cyberlogitec.domain.Office;
import com.cyberlogitec.domain.Tester;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Developer developer(){
        return new Developer();
    }
    @Bean
    public Tester tester(){
        return new Tester();
    }
    @Bean
    public Office office(){
        return new Office(this.developer(), this.tester());
    }
}
