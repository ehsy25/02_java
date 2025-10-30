package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.vo.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void information(String str) {

        String[] members = str.split("[|]"); // 회원 구분
        Member[] memberArr = new Member[members.length]; // 회원 배열 생성

        for (int i = 0; i < members.length; i++) {
            String[] info = members[i].split(","); // 회원 정보 구분

            memberArr[i] = new Member(
                    Integer.parseInt(info[0]),                 // 회원번호
                    info[1],                                   // 이름
                    Integer.parseInt(info[2]),                 // 키
                    Integer.parseInt(info[3]),                 // 몸무게
                    LocalDate.parse(info[4], DateTimeFormatter.ofPattern("yyyyMMdd")) // 생일
            );
        }

        // 회원정보 출력
        for (Member member : memberArr) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        information("1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319");
    }
}
