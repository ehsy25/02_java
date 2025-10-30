package com.ohgiraffers.exception.user;

public class UserValidator {

    public void validateUserInfo(String userId, String userName) throws MissingInfoException {
        // null이거나 빈 문자열(trim()으로 공백 제거 후)인지 확인
        boolean isIdMissing = (userId == null || userId.trim().isEmpty());
        boolean isNameMissing = (userName == null || userName.trim().isEmpty());

        String missingFields = "";

        if (isIdMissing && isNameMissing) {
            missingFields = "ID, 이름";
        } else if (isIdMissing) {
            missingFields = "ID";
        } else if (isNameMissing) {
            missingFields = "이름";
        }

        if (isIdMissing || isNameMissing) {
            throw new MissingInfoException("필수 정보(" + missingFields + ")가 누락되었습니다.");
        }

        System.out.println("사용자 정보 검증 완료.");
    }
}
