package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.util.Arrays;

public class run {
    public static void main(String[] args) {

    String inputStr = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

    //멤버 파싱 " | "  별로 파싱한다.
    String[] before_tok_mem = inputStr.split("[|]");
    //멤버객체배열 생성
    Member[] members = new Member[before_tok_mem.length];

    //멤버 정보 파싱 -> " , "
    for  (int i = 0; i < before_tok_mem.length; i++) {
        String[] mem = before_tok_mem[i].split(",");
        int memberNo = Integer.parseInt(mem[0]);
        String memberName = mem[1];
        int height = Integer.parseInt(mem[2]);
        int weight = Integer.parseInt(mem[3]);
        members[i] = new Member(memberNo, memberName, height, weight, LocalDate.now());
    }
    for (Member member : members) {
        System.out.println(member.information());
    }

    }
}
