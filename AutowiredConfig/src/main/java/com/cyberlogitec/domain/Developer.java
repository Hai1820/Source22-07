package com.cyberlogitec.domain;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Staff {

    @Override
    public void make() {
        System.out.println("Build Project");
    }
}
