package com.E.section04.uses2;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();

        DatabaseSaveProvider dsp = new DatabaseSaveProvider();
        FileSaveProvider fsp = new FileSaveProvider();

        Person person = new Person(fsp);
        person.doSomething();
    }
}
