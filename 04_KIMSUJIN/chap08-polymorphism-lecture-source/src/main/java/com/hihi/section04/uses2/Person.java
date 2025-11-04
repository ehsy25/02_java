package com.hihi.section04.uses2;

public class Person {

    private final SaveProvider saveProvider;

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }
    public void doSomething(){
        String data = "String data";

        saveProvider.save(data);
    }

}
