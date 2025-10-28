package com.ohgiraffers.section04.users2;

public class Person {

    private SaverProvider saverProvider;

    public Person(SaverProvider saverProvider){
        this.saverProvider = saverProvider;
    }

    public void doSomething(){
        String data = "string data";

        saverProvider.save(data);
    }
}
