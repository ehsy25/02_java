package com.ohgiraffers.exception.file;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test7();
    }

    public void test7() {
        String[] fileNames = {"profile.jpg", "document.pdf"};

        FileValidator validator = new FileValidator();

        for (String fileName : fileNames) {
            try {
                validator.validateExtension(fileName);
            } catch (InvalidFileFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
