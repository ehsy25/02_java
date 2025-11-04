package com.ohgiraffers.section04.users2;

import javax.sql.DataSource;

public class Application
{
    public static void main(String[] args)
    {
        DatabaseSaveProvider databaseSaveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(fileSaveProvider);
        person.doSomething();

    }
}
