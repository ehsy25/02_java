package com.ohgiraffers.section08.users;

import java.util.Arrays;

public class MemberService {

    /* 회원 가입 */
    public void signUpMembers(){

        Member[] members = new Member[5];   // null, null, null, null, null
        members[0] = new Member(1, "user01", "pass01", "이토 히로부미", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "도쿠가와 이에야스", 16, '여');
        members[2] = new Member(3, "user03", "pass03", "시진핑", 40, '남');
        members[3] = new Member(4, "user04", "pass04", "도널드 트럼프", 30, '여');
        members[4] = new Member(5, "user05", "pass05", "블라디미르 푸틴", 22, '남');

        MemberRegister register = new MemberRegister();
        register.regist(members);
    }

    public void showAllMembers() {

        MemberFinder finder = new MemberFinder();
        System.out.println("========= 가입한 회원 목록 =========");
        System.out.println(Arrays.toString(finder.findAllMembers()));
    }
}
