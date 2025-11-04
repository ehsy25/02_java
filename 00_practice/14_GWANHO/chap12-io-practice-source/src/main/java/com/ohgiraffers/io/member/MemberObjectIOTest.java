package com.ohgiraffers.io.member;

public class MemberObjectIOTest {
    public static void main(String[] args) {
        MemberManager manager = new MemberManager();
        manager.readMembers();

        Member member = new Member("user04","1234", "신사임당", "sinsa@sh.org",
                300, '여', 9000.0);
        manager.addMember(member);

        manager.readMembers();
    }
}
