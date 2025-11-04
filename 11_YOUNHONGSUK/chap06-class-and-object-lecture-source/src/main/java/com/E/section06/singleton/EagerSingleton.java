package com.E.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new  EagerSingleton();


    /*a public class now has a private constructor, so it's impossible to create an
    * instance of the class unless we use a separate method*/
    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eager;
    }

}
