package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) >= 'a' && s.toLowerCase().charAt(i) <= 'z') {
                count++;
            } else throw new CharCheckException();
            }
        System.out.println(count);

        return count;
        }
    }

