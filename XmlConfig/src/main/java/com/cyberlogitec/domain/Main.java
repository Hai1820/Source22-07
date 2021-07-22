package com.cyberlogitec.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {
    public static void main(String[] args) {



        Resource resource = new ClassPathResource("beans.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext(resource);
        BeanFactory beanFactory   = new XmlBeanFactory(resource);
        Office office = (Office) beanFactory.getBean("office");
       Staff developer = office.getDeveloper();
       developer.make();
//        Office office = (Office) resource.getBean("office");
//        Staff developer = office.getDeveloper();
//        Staff test = office.getTester();

    }
}
