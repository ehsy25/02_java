package com.ohgiraffers.exception.array;

public class ArrayProcessor {
    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException{
        int num;
        if(arr.length-1<index){
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~"+ ((arr.length)-1) +")");
        }
        else{
            num=index;
        }

        return num;
    }
}
