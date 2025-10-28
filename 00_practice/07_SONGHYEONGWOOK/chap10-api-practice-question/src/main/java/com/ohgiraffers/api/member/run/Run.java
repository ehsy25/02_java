package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {

        String memberInfo = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        StringTokenizer stringTokenizer = new StringTokenizer(memberInfo, "|");
        int index = 0;
        Member[] members = new Member[3]; // 최종
        String[] eachMemeber = new String[3]; // 1차 : |
        String[] eachMemberInfo = new String[5]; // 2차 : ,

        while (stringTokenizer.hasMoreTokens()) {
            eachMemeber[index] = stringTokenizer.nextToken();
            System.out.println(eachMemeber[index]);
            index++;
        }

        for (int i = 0; i < eachMemeber.length; i++) {

            StringTokenizer st = new StringTokenizer(eachMemeber[i], ",");

            int memberNo = Integer.parseInt(st.nextToken());
            String memberName = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            String birth = st.nextToken();

            members[i] = new Member(memberNo, memberName, height, weight, birth);
        }

        for(int i = 0; i < members.length; i++){
            System.out.println(members[i].information());
        }

    }
}