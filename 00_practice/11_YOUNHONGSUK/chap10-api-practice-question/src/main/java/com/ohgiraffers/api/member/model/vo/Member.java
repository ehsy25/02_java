package com.ohgiraffers.api.member.model.vo;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Member {

    private int num;
    private String name;
    private int height;
    private int weight;
    private String date;

    public Member() {
    }

    public Member(int num, String name, int height, int weight, String date) {
        this.num = num;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.date = date;
    }

    public String information(){

        //기본 제공 데이터
        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        //스트링 | 기준으로 자르기
        StringTokenizer st = new  StringTokenizer(data, "|");

        //잘라진 스트링 array에 집어넣기
        String[] sa = new String[st.countTokens()];
        int count = 0;
        /*stringTokenizer는 리스트를 만들고, 리스트의 포인터는 자동으로 넘어가지 않으니
         *hasmoreTokens()로 다음 토큰 있는지 확인하면서 다음 토큰으로 넘어가기
         */
        while(st.hasMoreTokens()){
            sa[count++] = st.nextToken();
        }

        //각 멤버를 받을 array 생성
        Member[] ma = new  Member[3];

        //멤버의 수 만큼 진행하기 위해 sa.length를 조건으로 사용
        for(int i = 0; i < sa.length; i++){
            //sa[i]에는 각 멤버의 모든 정보가 쉼표로 나눠져서 들어있다
            // 쉼표를 기준으로 토큰을 나누고, 나누어진 스트링에서
            // 필요한 정보를 멤버의 생성자에 넘겨준다
            StringTokenizer st2 = new StringTokenizer(sa[i], ",");

            int number = Integer.parseInt(st2.nextToken());
            String username = st2.nextToken();
            int h = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());
            String birthday = st2.nextToken();

            ma[i] = new Member(number, username, h, w, birthday);
        }

        for(int i=0;i<ma.length;i++){
            System.out.println(ma[i].getNum());
            System.out.println(ma[i].getName());
            System.out.println(ma[i].getWeight());
            System.out.println(ma[i].getHeight());
            System.out.println(ma[i].getDate());
            System.out.println("========================");
        }
        return Arrays.toString(ma);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getDate() {
        return date;
    }
}