package com.cyberlogitec.domain;

public class Office {
    private Staff developer;
    private Staff tester;

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
