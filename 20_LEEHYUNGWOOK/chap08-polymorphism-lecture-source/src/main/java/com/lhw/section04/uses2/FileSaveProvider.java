package com.lhw.section04.uses2;

public class FileSaveProvider implements SaveProvider {
    @Override
    public boolean save(String data) {
        System.out.println("doing File");
        return false;
    }
}
