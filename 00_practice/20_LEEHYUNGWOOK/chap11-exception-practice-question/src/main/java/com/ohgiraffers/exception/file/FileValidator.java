package com.ohgiraffers.exception.file;

public class FileValidator {

    public void validateExtension(String filename) throws InvalidFileFormatException {
        if (filename.substring(filename.lastIndexOf('.')).equals(".jpg")
        || filename.substring(filename.lastIndexOf('.')).equals(".png")) {
            System.out.println("파일 형식 검증 완료: " + filename);
        } else {
            throw new InvalidFileFormatException("허용되지 않는 파일 형식입니다. (.jpg, .png만 허용");
        }
    }


}
