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
        Member[] ma = new  Member[3];

        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        StringTokenizer st = new  StringTokenizer(data, "|");

        String[] sa = new String[st.countTokens()];

        int count = 0;
        while(st.hasMoreTokens()){
            sa[count++] = st.nextToken();
        }

        //System.out.println(Arrays.toString(sa));

        String[] fields = new String[15];
        int count2 = 0;
        for(int i=0;i<sa.length;i++){
            StringTokenizer st2 = new StringTokenizer(sa[i], ",");
            for(int j=0;j<fields.length;j++){
                if(st2.hasMoreTokens()){
                    fields[count2++] = st2.nextToken();
                }
            }
        }

        //System.out.println(Arrays.toString(fields));

        ma[0] = new Member(Integer.valueOf(fields[0]), fields[1], Integer.valueOf(fields[2]),
                Integer.valueOf(fields[3]), fields[4]);
        ma[1] = new Member(Integer.valueOf(fields[5]), fields[6], Integer.valueOf(fields[7]),
                Integer.valueOf(fields[8]), fields[9]);
        ma[2] = new Member(Integer.valueOf(fields[10]), fields[11], Integer.valueOf(fields[12]),
                Integer.valueOf(fields[13]), fields[14]);

        for(int i=0;i<ma.length;i++){
            System.out.println(ma[i].getNum());
            System.out.println(ma[i].getName());
            System.out.println(ma[i].getWeight());
            System.out.println(ma[i].getHeight());
            System.out.println(ma[i].getDate());
            System.out.println("========================");
        }


        return "";

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



