package com.E.section04.wrapper;

public class Application1 {

    public static void main(String[] args){

        int intValue = 20;
        //    Integer boxingNUmber1 = new Integer(intValue);
        Integer boxingNUmber1 = Integer.valueOf(intValue);

        int unbox = boxingNUmber1.intValue();

        Integer boxingNUmber2 = intValue;

        int unBoxingNumber2 = boxingNUmber2;


    }
}
