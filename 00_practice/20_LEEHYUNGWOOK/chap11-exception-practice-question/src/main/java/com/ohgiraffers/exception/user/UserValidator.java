package com.ohgiraffers.exception.user;

public class UserValidator {

    public void validateUserInfo(String userId, String userName) throws MissingInfoException {
        boolean isId=true,isName = true;
        if ( userId == null || userId.equals("")) {
            isId = false;
        }
        if ( userName == null || userName.equals("")) {
            isName = false;
        }
        String result = "";
        if (!isId) {
            if (!isName) {
                result = "필수 정보(ID, 이름)가 누락되었습니다";
            } else {
                result = "필수 정보(ID)가 누락되었습니다.";
            }
        } else if (!isName) {
            result = "필수 정보(이름)가 누락되었습니다.";
        }
        if (result.isEmpty()) {
            System.out.println("사용자 정보 검증 완료");
        } else {
            throw new MissingInfoException(result);
        }
    }
}
