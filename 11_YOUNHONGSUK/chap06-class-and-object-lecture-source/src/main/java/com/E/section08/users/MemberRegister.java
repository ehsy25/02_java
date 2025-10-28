package com.E.section08.users;

public class MemberRegister {



    public void regi(Member[] mem){
        System.out.println("Registering members");

        for(int i=0;i <mem.length;i++){
            System.out.println(mem[i].getName() + " registered");
        }

        if(MemberRepository.store(mem)){
            System.out.println(mem.length + "Member registered");

        }

    }


}
