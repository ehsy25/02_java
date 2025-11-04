package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        String mem = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] mArr = mem.split("\\|");

        for (int i = 0; i < mArr.length; i++) {
            String[] members = mArr[i].split(",");

            int memberNo = Integer.parseInt(members[0]);
            String memberName = members[1];
            int height = Integer.parseInt(members[2]);
            int weight = Integer.parseInt(members[3]);
            LocalDate birth = LocalDate.parse(members[4], DateTimeFormatter.ofPattern("yyyyMMdd"));

            Member member = new Member(memberNo, memberName, height, weight, birth);
            System.out.println(member);

        }

//        Member[] memberList = new  Member[];
//        memberList = Member[1]];
//        for (int j = 0; j < mArr.length; j++) {
//
//        }





    }
}
