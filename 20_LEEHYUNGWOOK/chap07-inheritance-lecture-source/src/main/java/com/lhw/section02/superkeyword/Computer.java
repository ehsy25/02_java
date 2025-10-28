package com.lhw.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    /*
    * Computer는 하나의 Product이지만 Product는 Computer가 아니다.
    * Is-A 관계 성립
    * */
    private String cpu;
    private int ssd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer클래스 기본생성자 호출됨..");
    }

    // 내 것만 넣어주기
    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    // 매개변수를 통해 부모 것을 가져온다.
    // 내 것+ 부모것 super(매개변수)를 통해 가져온다.
    public Computer(String code, String brand, String name, int price
            , Date manufacturingDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.operationSystem = operationSystem;
        this.ssd = ssd;
        this.ram = ram;
        //this(cpu, ssd, ram, operationSystem); -> 이렇게는 안되나?
        /* 위에처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는의미는
        * 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자느 한번만 호출
        *this안에는 super가 이미 존재한다.(부모단일이라 안됨)*/
    }

    /*
    * setter, getter는 부모필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요 없이 부모클래스에 작성한 것을 사용할 수 있다.
    * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 작성한다.
    * */
    public String getCpu() {
        return cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        /*
        * super.getInfo() : 정상적으로 부모메소드 호출
        * this.getInfo() : 본인의 getInfo호출 -> 재귀호출 stackoverflow
        * getInfo() : this.가 자동호출 -> 오류
        * 반드시 super.를 사용해야함.
        * */
        return super.getInformation() //super를 명시해주지 않으면 오류난다.
                + ", cpu = " + this.cpu
                + ", ssd = " + this.ssd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem;
    }
}
