package com.ogiraffers.section08.users;

public class MemberFinder {
    public Member[] findMembers(){
        return MemberRepository.findAllMembers();
        }
}
