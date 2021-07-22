package com.cyberlogitec.domain;

public class Developer implements Staff{
    @Override
    public void make() {
        System.out.println("Develop a project");
    }
}
