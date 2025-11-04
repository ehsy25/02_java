package com.chaewookim.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {

        int count = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if ((sb.charAt(i) >= 65 && sb.charAt(i) <= 90) || (sb.charAt(i) >= 97 && sb.charAt(i) <= 122)) {
                count++;
            } else if (sb.charAt(i) == ' ') {
                throw new CharCheckException("ㄴㄴ");
            }
        }

        return count;
    }
}
