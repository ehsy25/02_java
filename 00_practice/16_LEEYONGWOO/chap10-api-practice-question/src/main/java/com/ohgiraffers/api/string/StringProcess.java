package com.ohgiraffers.api.string;

import java.util.Arrays;
import java.util.Locale;

public class StringProcess {

    public String prechar(String s){

        s=s.substring(0,1).toUpperCase(Locale.ROOT)+s.substring(1);

        return s ;
    }

    public int charSu(String s, char ch){
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                sum++;
            }
        }
        return sum;
    }


}
