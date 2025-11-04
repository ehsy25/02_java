package com.ohgiraffers.exception.file;

public class FileValidator {

    public void validateExtension(String fileName) throws InvalidFileFormatException {

        String lowerFileName = fileName.toLowerCase();

        if (!lowerFileName.endsWith(".jpg") && !lowerFileName.endsWith(".png")) {
            throw new InvalidFileFormatException("허용되지 않는 파일 형식입니다. (.jpg, .png 만 허용)");
        }
        System.out.println("파일 형식 검증 완료: " + fileName);
    }
}
