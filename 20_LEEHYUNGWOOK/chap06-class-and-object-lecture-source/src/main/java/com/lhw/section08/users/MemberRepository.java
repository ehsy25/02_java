package com.lhw.section08.users;

public class MemberRepository {

    // static 변수 선언으로 Member 객체를 담는 배열을 DB로 취급

    private final static Member[] members = new Member[10]; // 객체배열 10개짜리
    private static int count;

    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {
            members[MemberRepository.count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers () {
        return members;
    }
}
