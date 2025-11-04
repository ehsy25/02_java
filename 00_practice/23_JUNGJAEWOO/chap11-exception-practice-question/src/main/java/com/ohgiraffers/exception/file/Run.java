package com.ohgiraffers.exception.file;

public class Run {
    public void test7(){
        FileValidator fv = new FileValidator();
        String s = "test.txt";
        try {
            fv.validateExtension(s);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test7();
    }
}
