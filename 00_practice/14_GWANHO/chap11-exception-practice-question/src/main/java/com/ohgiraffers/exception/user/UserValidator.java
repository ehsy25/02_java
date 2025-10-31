package com.ohgiraffers.exception.user;

public class UserValidator {
    public void validateUserInfo(String userId, String userName) throws MissingInfoException {
        if(userId == null || userId.isEmpty()) {
            throw new MissingInfoException("필수 정보([ID])가 누락되었습니다.");
        }

        if(userName == null || userName.isEmpty()) {
            throw new MissingInfoException("필수 정보([이름])가 누락되었습니다.");
        }

        System.out.println("사용자 정보 검증 완료.");
    }
}
