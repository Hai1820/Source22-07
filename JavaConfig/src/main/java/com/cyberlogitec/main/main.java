package com.cyberlogitec.main;

import com.cyberlogitec.config.Config;
import com.cyberlogitec.domain.Office;
import com.cyberlogitec.domain.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Office office = (Office) context.getBean("office");
        Staff developer =  office.getDeveloper();
        Staff tester = office.getTester();
        developer.make();
        tester.make();
    }
}
