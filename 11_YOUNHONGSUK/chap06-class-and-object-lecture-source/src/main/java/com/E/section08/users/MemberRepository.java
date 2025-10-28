package com.E.section08.users;

public class MemberRepository {

    private final static Member[] members = new Member[5];
    private static int count;

    public static boolean store(Member[] newMem){
        for(int i = 0; i < members.length; i++){
            members[count++] = newMem[i];
        }
        return true;
    }

    public static Member[] findAllMem(){
        return members;
    }
}
