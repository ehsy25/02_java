package com.E.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        Tiger[] ta = new Tiger[3];
        Rabbit[] ra = new Rabbit[3];
        Animal[] aa = new Animal[5];

        //다형성(업캐스팅)
        aa[0] = new Rabbit();
        aa[1] = new Tiger();
        aa[2] = new Rabbit();
        aa[3]= new Tiger();
        aa[4] = new Rabbit();


        //호출 시 동적 바인딩을 이용해서 출력함
        for(int i = 0; i < aa.length; i++){
            aa[i].cry();
        }


        for(int i = 0; i < aa.length; i++){
            if((aa[i] instanceof Rabbit)){
                ((Rabbit)aa[i]).jump();
            }
            else if ((aa[i] instanceof Tiger)){
                ((Tiger)aa[i]).bite();
            }
            else System.out.println("not a tiger or rabbit");
        }
    }

}
