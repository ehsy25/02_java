package com.swcamp.section04.uses2;

public class Application {

    public static void main(String[] args) {

        DatabaseSaveProvider dbSaveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(dbSaveProvider);

    }
}
