package com.ohgiraffers.section01.conditional;

public class Applicatiion {

    public static void main(String[] args) {
        A_if a = new A_if();
        // a.testsimpleIfStatement();
//        a.testNestedIfStatement();
        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatement();
        C_ifElseif c = new C_ifElseif();
//        c.testIfElseIfStatement();
//        c.testNestedIfElseIfStatement();
        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
        d.improveSwitchStatement();

    }
}
