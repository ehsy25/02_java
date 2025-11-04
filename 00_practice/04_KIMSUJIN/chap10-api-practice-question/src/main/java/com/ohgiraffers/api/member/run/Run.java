package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        Member member = new Member();
        //주어진 문자열
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] memarr = str.split("\\|");
        System.out.println(Arrays.toString(memarr));
        System.out.println(memarr.length);

        for(String mem : memarr){
            String [] meminfo = mem.split(",");
            System.out.println(Arrays.toString(meminfo));
            member.setMemberNo(Integer.parseInt(meminfo[0]));
            member.setMemberName(meminfo[1]);
            member.setHeight(Integer.parseInt(meminfo[2]));
            member.setWeight(Integer.parseInt(meminfo[3]));
//            member.setBirth(LocalDate.parse(meminfo[4]));
            System.out.println(member.information());
        }

    }
}
