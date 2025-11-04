package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.vo.Member;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] strArr = str.split("\\|");


        Member[] members = new Member[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String[] strArr1 = strArr[i].split(",");
            members[i] = new Member(Integer.parseInt(strArr1[0]),strArr1[1],Integer.parseInt(strArr1[2]),Integer.parseInt(strArr1[3]), strArr1[4]);
    }

        for (Member member : members) {
            System.out.println(member.information());
        }
    }
}
