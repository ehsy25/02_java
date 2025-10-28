package com.ohgiraffers.section04.uses2;

public class Person {

    private final SaveProvider sP;

    public Person(SaveProvider sP) {
        this.sP = sP;
    }

    public void doSomething() {
        String data = "string data";

        sP.save(data);
    }


}
