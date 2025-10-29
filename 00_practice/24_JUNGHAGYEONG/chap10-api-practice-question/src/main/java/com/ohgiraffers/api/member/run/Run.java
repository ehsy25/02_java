package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Run {

    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] memArr = str.split("\\|");
        Member[] members = new Member[memArr.length];
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int i = 0; i < memArr.length; i++) {
            String[] info = memArr[i].split(",");

            int memNo = Integer.parseInt(info[0]);
            String memName = info[1];
            int height = Integer.parseInt(info[2]);
            int weight = Integer.parseInt(info[3]);
            LocalDate birth = LocalDate.parse(info[4], format);

        members[i] = new Member(memNo, memName, height, weight, birth);
        }

        for (Member member : members) {
            System.out.println(member.information());
        }

    }
}
