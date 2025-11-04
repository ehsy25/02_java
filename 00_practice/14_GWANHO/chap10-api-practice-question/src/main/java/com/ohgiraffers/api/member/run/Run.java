package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {

        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] infos = str.split("\\|");

        Member[] members = new Member[infos.length];
        for (int i = 0; i < members.length; i++) {
            String[] part = infos[i].split(",");

            int no = Integer.parseInt(part[0]);
            String name = part[1];
            int height = Integer.parseInt(part[2]);
            int weight = Integer.parseInt(part[3]);

            int year = Integer.parseInt(part[4].substring(0, 4));
            int month = Integer.parseInt(part[4].substring(4, 6));
            int day = Integer.parseInt(part[4].substring(6, 8));
            LocalDate birth = LocalDate.of(year, month, day);
            members[i] = new Member(no, name, height, weight, birth);
        }

        for (Member member : members) {
            System.out.println(member.information());
        }
    }
}
