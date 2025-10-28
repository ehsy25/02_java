package com.lhw.section04.uses2;

import java.nio.file.Files;

public class Application {

    public static void main(String[] args) {

        DatabaseSaveProvider dbsaveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(dbsaveProvider);

        Person person2 = new Person(fileSaveProvider);
        person.doSomething();
        person2.doSomething();

    }
}
