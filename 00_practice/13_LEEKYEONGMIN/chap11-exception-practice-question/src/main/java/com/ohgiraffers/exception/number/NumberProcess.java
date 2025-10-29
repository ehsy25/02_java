package com.ohgiraffers.exception.number;


import com.ohgiraffers.exception.charcheck.CharCheckException;

public class NumberProcess {
    public boolean checkDouble(int a, int b) throws NumberRangeException {
        if(a<0 || b<0 ||a>100 || b>100){
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }

        if(b%a==0){
//            System.out.println(b%a);
            return true;
        }else {
//            System.out.println(b%a);
            return false;
        }
    }

}
