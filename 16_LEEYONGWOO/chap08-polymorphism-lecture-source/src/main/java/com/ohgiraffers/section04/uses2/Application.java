package com.ohgiraffers.section04.uses2;

public class Application {
    public static void main(String[] args) {
        FileSaveProvider fileSaveProvider = new FileSaveProvider();
        DatabaseSaveProvider saveProvider = new DatabaseSaveProvider();

        Person person = new Person(saveProvider);
        person.doSomething();
    }
}
