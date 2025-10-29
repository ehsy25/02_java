package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.vo.Member;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        StringTokenizer st = new StringTokenizer(str,"|");
        String mem [] = new String[st.countTokens()];
        for(int i=0;i<mem.length;i++)
            mem[i]=st.nextToken();

        Member member[] = new Member[mem.length];
        for(int i=0;i<mem.length;i++){
            st = new StringTokenizer(mem[i],",");
            int memberNo = Integer.parseInt(st.nextToken());
            String memberName = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            int birthDate = Integer.parseInt(st.nextToken());
            member[i] = new Member(memberNo,memberName,height,weight,birthDate);
        }

        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i].information());

        }





    }
}
