package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String info = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] rows = info.split("\\|");
        Member[] mem = new Member[rows.length];

        for (int i = 0; i < rows.length; i++) {
            String[] f = rows[i].split(",");
            int id = Integer.parseInt(f[0]);
            String name = f[1];
            int height = Integer.parseInt(f[2]);
            int weight = Integer.parseInt(f[3]);
            LocalDate birth = LocalDate.parse(f[4].trim(), DateTimeFormatter.BASIC_ISO_DATE);
            mem[i] = new Member(id, name, height, weight, birth);
        }
        for (Member m : mem) {
            System.out.println(m.information());
        }
    }
}
