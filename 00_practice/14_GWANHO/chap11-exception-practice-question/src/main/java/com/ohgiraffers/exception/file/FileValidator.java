package com.ohgiraffers.exception.file;

public class FileValidator {
    public void validateExtension(String fileName) throws InvalidFileFormatException {
        if(fileName.contains(".png") || fileName.contains(".jpg") || fileName.contains(".jpeg")) {
            System.out.println("파일 형식 검증 완료: [" + fileName + "]");
        } else {
            throw new InvalidFileFormatException("허용되지 않는 파일 형식입니다. (.jpg, .png 만 허용)");
        }
    }
}
