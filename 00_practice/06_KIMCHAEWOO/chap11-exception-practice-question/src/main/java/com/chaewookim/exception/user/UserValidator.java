package com.chaewookim.exception.user;

public class UserValidator {

    public void validateUserInfo(String userId, String userName) throws MissingInfoException {

        if (userId.isEmpty() && userName.isEmpty()) {
            throw new MissingInfoException("필수정보 userName, userId 누락");
        } else if (userId.isEmpty()) {
            throw new MissingInfoException("필수정보 userId 누락");
        } else if (userName.isEmpty()) {
            throw new MissingInfoException("필수정보 userName 누락");
        } else {
            System.out.println("사용자 정보 검증 완료");
        }
    }
}
