package com.ohgiraffers.exception.user;

public class UserValidator {

    public void validateUserInfo(String userId, String userName) throws MissingInfoException {

        boolean isIdMissing = (userId == null || userId.trim().isEmpty());
        boolean isNameMissing = (userName == null || userName.trim().isEmpty());

        if (isIdMissing && isNameMissing) {
            throw new MissingInfoException("필수 정보(ID, 이름)가 누락되었습니다.");
        } else if (isIdMissing) {
            throw new MissingInfoException("필수 정보(ID)가 누락되었습니다.");
        } else if (isNameMissing) {
            throw new MissingInfoException("필수 정보(이름)가 누락되었습니다.");
        }
    }
}
