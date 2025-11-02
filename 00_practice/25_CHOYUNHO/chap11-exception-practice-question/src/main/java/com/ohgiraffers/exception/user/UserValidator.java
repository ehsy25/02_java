package com.ohgiraffers.exception.user;

public class UserValidator {
    public void validateUserInfo(String userId, String userName) throws MissingInfoException{
        if(userId==null && userName==null){
            throw new MissingInfoException("필수 정보(ID, 이름)가 누락되었습니다.");
        }
        else if(userId.isEmpty()/* && userName!=null*/){
            throw new MissingInfoException("필수 정보 userId가 누락되었습니다.");
        }
        else if(userName.isEmpty()/* && userId!=null*/){
            throw new MissingInfoException("필수 정보 userName이 누락되었습니다.");
        }else{
            System.out.println("사용자 정보 검증 완료.");
        }
    }
}
