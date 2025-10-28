package com.lhw.section04.uses2;

public class DatabaseSaveProvider implements SaveProvider {


    @Override
    public boolean save(String data) {
        System.out.println("doing DB");
        return false;
    }
}
