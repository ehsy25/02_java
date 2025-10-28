package com.ohgiraffers.section04.uses2;

public class Application {

    public static void main(String[] args) {

        DatabaseSaveProvider dbsp = new DatabaseSaveProvider();
        FileSaveProvider fsp = new FileSaveProvider();

        Person person = new Person(fsp);
        person.doSomething();


    }
}
