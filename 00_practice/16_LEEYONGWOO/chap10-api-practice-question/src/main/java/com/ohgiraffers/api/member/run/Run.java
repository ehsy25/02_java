package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.awt.SystemColor.info;

public class Run {
    public static void main(String[] args) {

        String str="1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        StringTokenizer st=new StringTokenizer(str,"|");
        String[] info=new String[st.countTokens()];

        Member[] m=new Member[3];
        String[] inf=new String[3];

        int count=0;
        while(st.hasMoreTokens()) {
            String asd=st.nextToken();
            inf[count]=asd;
            count++;
        }

        String[][] inf2=new String[3][5];
        for(int i=0;i<inf.length;i++){
            StringTokenizer st2=new StringTokenizer(inf[i],",");
            for(int j=0;j<5;j++){
                inf2[i][j]=st2.nextToken();
            }
        }


        for(int i=0; i<m.length; i++){
            m[i]=new Member();
        }

        for(int i=0;i<inf2.length;i++){
            m[i].setMemberNo(Integer.parseInt(inf2[i][0]));
            m[i].setMemberName(inf2[i][1]);
            m[i].setHeight(Integer.parseInt(inf2[i][2]));
            m[i].setWeight(Integer.parseInt(inf2[i][3]));
            m[i].setBirth(inf2[i][4]);
        }

        for(int i=0;i<inf2.length;i++){
            System.out.print(m[i].information()+" ");
            System.out.println();
        }
    }
}
