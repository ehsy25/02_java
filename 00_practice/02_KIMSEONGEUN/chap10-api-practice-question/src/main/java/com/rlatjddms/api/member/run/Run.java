package com.rlatjddms.api.member.run;

import com.rlatjddms.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

    public static void main(String[] args) {

        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] arr = str.split("\\|");

        for(int i = 0; i < arr.length; i++) {
            String[] members = arr[i].split(",");

            int num = Integer.parseInt(members[0]);
            String name = members[1];
            int height = Integer.parseInt(members[2]);
            int weight = Integer.parseInt(members[3]);

            LocalDate birth = LocalDate.parse(members[4], DateTimeFormatter.ofPattern("yyyyMMdd"));

            Member member = new Member(num, name, height, weight, birth);
            System.out.println(member.information());
        }
    }
}
