package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;

public class Run {
    public static void main(String[] args) {

        Member member1 = new Member(1, "김연아", 165, 47, LocalDate.of(1990, 9, 5));
        Member member2 = new Member(2, "양세형", 167, 60, LocalDate.of(1985, 8, 18));
        Member member3 = new Member(3, "김래원", 182, 80, LocalDate.of(1981, 3, 19));

        Member[] members = new Member[3];
        members[0] = member1;
        members[1] = member2;
        members[2] = member3;

        for(int i = 0; i < members.length; i++){
            System.out.print(members[i].information());

            if(i != members.length - 1){
                System.out.print(" | ");
            }
        }
    }
}
