package com.E.section08.users;

import java.util.Arrays;

public class MemberFinder {

    public Member[] getMembers(){
        return MemberRepository.findAllMem();

    }
}
