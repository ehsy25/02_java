package com.sekong.section08.users;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }
}
