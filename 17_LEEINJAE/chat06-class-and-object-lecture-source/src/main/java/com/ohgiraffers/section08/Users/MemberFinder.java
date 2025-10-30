package com.ohgiraffers.section08.Users;

public class MemberFinder {

    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
