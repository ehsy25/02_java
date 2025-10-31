package com.ohgiraffers.api.string;


public class StringProcess {
    public String preChar(String s){
        char c[] = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        String str = String.valueOf(c);
        return str;
    }

    public int charSu(String s, char ch){
        char c[] =s.toCharArray();
        int count =0;
        for(int i=0;i<c.length;i++){
            if(c[i]==ch){
                count++;
            }
        }
        return count;
    }


}
