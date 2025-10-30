package com.lhw.section04.uses2;

import java.nio.file.Files;

public class Application {

    public static void main(String[] args) {

        DatabaseSaveProvider dbsaveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        //매개변수 생성자로 반드시 Person(매개변수)를 입력해 주어야 한다.
        // -> 강제적으로 SaveProvider를 가져오기 위한 방법
        Person person = new Person(dbsaveProvider);

        Person person2 = new Person(fileSaveProvider);
        person.doSomething();
        person2.doSomething();

    }
}
