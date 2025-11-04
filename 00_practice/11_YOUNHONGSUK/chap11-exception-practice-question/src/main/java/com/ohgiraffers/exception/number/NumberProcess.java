package com.ohgiraffers.exception.number;

public class NumberProcess {

    public NumberProcess() {
    }

    public boolean checkDouble(int a, int b) throws NumberRangeException{
        if(a <= 100 && b <= 100 && a >= 1 && b >= 1){
            if(a % b == 0){
                return true;
            }
        }else throw new NumberRangeException();

        return false;
    }
}
