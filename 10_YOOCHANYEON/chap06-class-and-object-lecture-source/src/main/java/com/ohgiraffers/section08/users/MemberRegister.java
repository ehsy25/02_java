package com.ohgiraffers.section08.users;

public class MemberRegister {

    public void regist(Member[] members) {

        System.out.println("돈줄 추가~");

        for(int i = 0; i < members.length; i++){
            System.out.println(members[i].getName() + "님이 돈줄이 되었습니다.");
        }

        if(MemberRepository.store(members)){
            System.out.println("총 " + members.length + "명의 돈줄 추가 성공!");
        }
    }
}
