package com.cyberlogitec.domain;

import org.springframework.stereotype.Component;

@Component
public class Tester implements Staff{
    @Override
    public void make() {
        System.out.println("Test Project");
    }
}
