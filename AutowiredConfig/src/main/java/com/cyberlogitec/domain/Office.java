package com.cyberlogitec.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Office {
    @Autowired
    private Staff developer;
    @Autowired
    private Staff tester;

    public Office() {
    }

    public Office(Staff developer, Staff tester) {
        this.developer = developer;
        this.tester = tester;
    }

    public Staff getDeveloper() {
        return developer;
    }

    public void setDeveloper(Staff developer) {
        this.developer = developer;
    }

    public Staff getTester() {
        return tester;
    }

    public void setTester(Staff tester) {
        this.tester = tester;
    }
}
