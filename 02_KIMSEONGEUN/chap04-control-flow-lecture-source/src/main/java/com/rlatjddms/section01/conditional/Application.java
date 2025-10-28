package com.rlatjddms.section01.conditional;

public class Application {

    public static void main(String[] args) {
        A_if a =  new A_if();
        a.testSimpleIfStatement();
        a.testNestedIfStatement();

        B_ifElse b =  new B_ifElse();
        b.testSimpleIfElseStatement();
        b.testNestedIfElseStatement();

        C_ifElseif c =  new C_ifElseif();
        c.testIfElseifStatement();

        D_switch d =  new D_switch();
        d.testSimpleSwitchStatement();
        d.improveSwitchStatement();
    }
}
