package com.lhw.section06.singleton;

public class LazySingleton {
    /*null값을 받아오고 이후에 인스턴스 생성해주는 방법*/
    private static LazySingleton lazy;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazy == null){
            lazy = new LazySingleton();//인스턴스를 단 한번 생성 하도록 만든다.
        }
        return lazy;
    }
}
