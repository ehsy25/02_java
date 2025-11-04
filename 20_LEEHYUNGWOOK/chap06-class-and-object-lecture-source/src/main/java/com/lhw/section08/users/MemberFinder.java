package com.lhw.section08.users;

public class MemberFinder {
    // MemberRepository에서 맴버 찾는 거 불러오는 거만 하면 됨
    public Member[] finfAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
