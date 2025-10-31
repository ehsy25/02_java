package com.chaewookim.exception.file;

public class FileValidator {

    public void validateExtension(String fileName) throws InvalidFileFormatException {

        String extension = fileName.substring(fileName.length()-4);

        if (!(extension.equals(".jpg") || extension.equals(".png"))) {
            throw new InvalidFileFormatException("허용되지 않는 파일 형식");
        } else {
            System.out.println("파일 형식 검증 완료: " + extension);
        }
    }
}
