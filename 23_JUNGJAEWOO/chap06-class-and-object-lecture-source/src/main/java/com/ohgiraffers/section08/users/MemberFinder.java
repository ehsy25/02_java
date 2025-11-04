package com.ohgiraffers.section08.users;

public class MemberFinder {
    public Member[] findAllMember(){
        return MemberRepository.findAllMembers();
    }
}
