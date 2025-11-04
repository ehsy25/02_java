package com.ohgiraffers.exception.file;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();


    }
    public void test7(){
//        String fileName = "profile.jpg";
        String fileName = "document.pdf";
        try{
            FileValidator fv = new FileValidator();
            fv.validateExtension(fileName);
        }catch(InvalidFileFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
