package com.ohgiraffers.exception.file;

public class Run {
    public void test6() {

        FileValidator fv = new FileValidator();
        String file1 = "profile.JPG";
        String file2 = "document.pdf";
        try {
            fv.validateExtension(file1);
            fv.validateExtension(file2);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        Run run = new Run();
        run.test6();
    }
}
