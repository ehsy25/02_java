package com.ohgiraffers.exception.array;

public class ArrayProcessor {

    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException{
        if(index<0 || index>arr.length-1){
            throw new ArrayLengthException();
        }else return arr[index];
    }

}
