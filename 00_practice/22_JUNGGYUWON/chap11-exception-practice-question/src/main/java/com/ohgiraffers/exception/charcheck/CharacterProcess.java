package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s)throws CharCheckException{
            String[] arr =  s.split(" ");
            char[]chars = s.toCharArray();
            int count=0;
            if(arr.length >1){
                throw new CharCheckException();
            }else{
                for (char aChar : chars) {
                    aChar = Character.toLowerCase(aChar);
                    if(aChar> 96 && aChar<123){
                        count++;
                    }
                }
            }
        return count;
    }
}
