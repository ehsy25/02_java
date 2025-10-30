package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String str){
        char first = str.charAt(0);

        first-=32;

        return first+str.substring(1);
    }

    public int charSu(String str, char ch){
        int num = 0;

        boolean flag = true;

        while (flag){
            if(str.indexOf(ch) > 0){
                str = str.substring(str.indexOf(ch) + 1);
                num++;
            }
            else{
                flag = false;
            }
        }

        return num;
    }
}
