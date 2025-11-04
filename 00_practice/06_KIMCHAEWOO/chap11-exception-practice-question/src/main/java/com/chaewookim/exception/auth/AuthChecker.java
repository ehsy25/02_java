package com.chaewookim.exception.auth;

public class AuthChecker {

    public void checkAdminPermission(String userId, boolean isAdmin) throws PermissionDeniedException {

        if (!isAdmin) {
            throw new PermissionDeniedException(userId + " 너는 권한 없음");
        } else {
            System.out.println("관리자 권한 확인. 환영한다 " + userId + "야");
        }
    }
}
