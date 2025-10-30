package com.ohgiraffers.exception.user;

public class UserValidator {

    public void validateUserInfo(String userId, String userName) throws MissingInfoException {
        if ( ((userId == null) || (userId.isEmpty())) && ((userName == null) || (userName.isEmpty())) ) {
            throw new MissingInfoException("필수 정보 userId와 userName이 누락되었습니다.");
        }
        if ( (userId == null) || (userId.isEmpty()) ) {
            throw new MissingInfoException("필수 정보 userId가 누락되었습니다.");
        }
        if ( (userName == null) || (userName.isEmpty()) ) {
            throw new MissingInfoException("필수 정보 userName이 누락되었습니다.");
        }
        System.out.println("사용자 정보 검증 완료.");
    }
}
