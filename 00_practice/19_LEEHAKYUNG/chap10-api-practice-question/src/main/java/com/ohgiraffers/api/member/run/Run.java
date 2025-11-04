package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Model;

import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {
        String target = "1,김연아,165,47|2,양세형,167,60|3,김래원,182,80";
        String[] splited = target.split("[,|]");
        int dataNum = splited.length;
        Model[] model = new Model[dataNum / 4];

        int cnt = 0;
        for (int i = 0; i < dataNum/4; i++) {
            model[i] =  new Model(Integer.parseInt(splited[4*i + 0]),
                        splited[4*i + 1],
                        Integer.parseInt(splited[4*i + 2]),
                        Integer.parseInt(splited[4*i + 3]));
        }

        for (int i = 0; i < model.length; i++) {
            System.out.println(model[i].information());
        }
    }

}
