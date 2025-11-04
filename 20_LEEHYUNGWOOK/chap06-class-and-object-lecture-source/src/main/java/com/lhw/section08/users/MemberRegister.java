package com.lhw.section08.users;

public class MemberRegister {

    public void regist(Member[] members) {

        System.out.println("회원을 등록합니다.");

        for (Member member : members) {
            System.out.println(member.getName() + "님은 회원가입을 성공하셨습니다.");
        }
        if (MemberRepository.store(members)) { //데이터베이스에 실제로 등록하는 곳
            System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
