package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    /*Computer는 하나의 Product이지만 Product는 Computer가 아니다.(IS-A) */
    private String cpu;
    private int ssd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본생성자 호출");
    }

    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufactureDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brand, name, price, manufactureDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;

//        this(cpu, ssd, ram, operationSystem);

        /* 위에처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
        부모 인스턴스를 두개 생성할 수 없기 때문에 부모 생성자는 한번만 호출한다.
         */
    }

    @Override
    public String getInformation() {
        /*
        * super.getInformation(): 정상적으로 부모의 메소드를 호출
        * this.getInformation() : 본인의 getInformation() 호출 -> 재귀 호출이 일어나며 stackoverflow가 발생
        * getInformaion() : this.이 자동 추가되어 재귀호출이 일어나고 stackoverflow발생
        * 따라서 이런 경우 super.을 명시적으로 사용해야한다.
         */
        return super.getInformation()
                + ", cpu = " + cpu
                + ", ssd = " + ssd
                + ", ram = " + ram
                + ", operationSystem = " + operationSystem
                ;
    }


}
