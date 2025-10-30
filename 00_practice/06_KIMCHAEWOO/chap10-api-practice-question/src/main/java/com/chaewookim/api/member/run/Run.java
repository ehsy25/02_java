package com.chaewookim.api.member.run;

import com.chaewookim.api.member.model.vo.Member;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {

        String input = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        StringTokenizer st = new StringTokenizer(input, "\\|");

        Member[] memArr = new Member[st.countTokens()];

        for (int i = 0; i < memArr.length; i++) {
            String[] s = st.nextToken().split(",");
            memArr[i] = new Member(Integer.parseInt(s[0]), s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]), s[4]);
        }

        for (Member m : memArr) {
            System.out.println(m.information());
        }
    }
}
