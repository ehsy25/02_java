package com.ohgiraffers.exception.user;

public class UserValidator {
    public void validateUserInfo(String userId, String userName) throws MissingInfoException{
        boolean idMissing = (userId == null) || userId.isBlank();
        boolean nameMissing = (userName == null) || userName.isBlank();

        if (idMissing || nameMissing) {
            StringBuilder sb = new StringBuilder("필수 정보(");
            if (idMissing) sb.append("ID");
            if (idMissing && nameMissing) sb.append(", ");
            if (nameMissing) sb.append("이름");
            sb.append(")가 누락되었습니다.");
            throw new MissingInfoException(sb.toString());
        }

        System.out.println("사용자 정보 검증 완료.");
    }
}

