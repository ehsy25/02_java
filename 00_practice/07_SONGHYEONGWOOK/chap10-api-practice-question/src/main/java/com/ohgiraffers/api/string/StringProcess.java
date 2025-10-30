package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String helloWorld) {
        String str = helloWorld.substring(0, 1).toUpperCase() + helloWorld.substring(1);
        return str;
    }

    public int charSu(String applicationCarCable, char c) {
        String str = applicationCarCable;
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
