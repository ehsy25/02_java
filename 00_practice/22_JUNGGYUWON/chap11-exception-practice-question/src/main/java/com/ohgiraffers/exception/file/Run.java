package com.ohgiraffers.exception.file;

public class Run {
    FileValidator fv = new FileValidator();

    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }

    public void test7(){
        try{
            fv.validateExtension("profile.jpg");
        }
        catch (InvalidFileFormatException e){
            e.printStackTrace();
        }
    }

}
