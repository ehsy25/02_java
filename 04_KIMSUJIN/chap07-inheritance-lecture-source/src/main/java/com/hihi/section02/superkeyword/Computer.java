package com.hihi.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    /*Computer는 하나의 Product이지만 Prduct는 Computer가 아니다. (IS-A)*/
    private String cpu;
    private String ssd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, String ssd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String operationSystem, int ram, String ssd, String cpu) {
        super(code, brand, name, price, manufacturingDate);
        this.operationSystem = operationSystem;
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
//        this(cpu, ssd, ram, operationSystem);

        /*
        * 위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        * super()를 두 번 호출하는 것과 같기 때문에 허용되지 않는다.
        * 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한번만 호출된다.*/
    }

    /*
    * setter와 getter는 부모 필드의 메소드에 대해선는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요 없이 부모클래스에 작성한것만 사용할 수 있다.
    * 따라서 자식클래스에 추가된 필드에 대해서만 setter/getter를 작성한다.*/
    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getInformation() {
        /*
        * super.getInformation() : 정상적으로 부모의 메소드를 호출
        * this.getInformation(0 : 본인의 getInformation() 호출 ->  재귀 호출이 일어나며
        *                                           stackoverflow가 발생
        * getInformation() : this. 이 자동 추가되어 재귀호출이 일어나고 stackoverflow 발생
        * 따라서 이런 경우 super.을 명시적으로 사용해야 한다.*/
        return super.getInformation()
                + ", cpu" + this.cpu
                + ", ssd" + this.ssd
                + ", ram" + this.ram
                + ", operationSystem" + this.operationSystem;
    }
}
