package com.ohgiraffers.exception.file;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }

    public void test7() {

        try {

            FileValidator fv = new FileValidator();

            //fv.validateExtension("profile.jpg");
            fv.validateExtension("document.pdf");

        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
