package com.E.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        User user = new User();

        User u2 = new User("red", "nuguri");

        u2.getInfo();
        System.out.println(u2.getInfo());

        User u3 = new User("1", "nuguri", "guriburi", new Date() );

        u3.getInfo();
        System.out.println(u3.getInfo());
    }
}
