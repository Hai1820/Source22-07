package com.cyberlogitec.domain;

public class Office {
    private Staff developer;
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
