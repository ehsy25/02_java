package com.ohgiraffers.api.string;

import java.util.StringTokenizer;

public class StringProcess {

    public String preChar(String s){

        //첫글자를 제외한 나머지 글자들을 포함한 새로운 스트링 생성
        String left = s.substring((1));
        //첫글자만 따로 제외해서 잘라내기
        String start = s.charAt(0) + "";
        //첫글자 대문자로 변환
        start = start.toUpperCase();
        //변환한 첫글자와 나머지 글 합쳐서 리턴하기
        return start + left;
    }

    public int charSu(String s, char ch){
        //몇 번 있는지 세기 위한 변수
        int count = 0;
        //단어의 길이만큼 확인하기
        for (int i =0; i < s.length(); i++){
            //charAt위치의 글자가 검색과 일치할 시
            if(s.charAt(i) == ch){
                //카운터 올리기
                count++;
            }
        }
        //카운터 리턴하기
        return count;
    }
}
