package com.ohgiraffers.api.token;

public class TokenTest {

    public static void main(String[] args) {
        TokenTest tokenTest = new TokenTest();
        System.out.println(tokenTest.tokenizer("J a v a P r o g r a m "));
    }

    public String tokenizer(String str){
        String[] tokens = str.split(" ");
        char[] chars = new char[tokens.length];
        int i=0;
        for(String token : tokens){
            char ch = token.charAt(0);
            if(ch>64 && ch<91){
                ch+=32;
                chars[i++]=ch;
            }
            else {
                chars[i++]=ch;
            }
        }

        return new String(chars);
    }

}
