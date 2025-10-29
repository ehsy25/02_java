package com.ohgiraffers.exception.number;

public class NumberProcess {
    public boolean checkDouble(int a, int b) throws NumberRangeException{
        if(a>0 &&b>0 &&a< 101 && b< 101){
            if(a%b==0){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            throw new NumberRangeException();
        }
    }
}
