package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    /* Computer는 하나의 Product이지만 Product는 Computer가 아니다*/
    private String cpu;
    private int ssd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본생성자 호출");
    }

    public Computer(String cpu, int ssd, int ram, String operatingSystem) {
        super();
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int ssd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        /*
        * 위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        * super()를 두번 호출하는 것과 같기때문에 허용되지 않는다.
        * 부모 인스턴스를 두개 생성할 수 없기 때문에 부모 생성자는 한번만 호출한다.
        * */
    }

    /*
    * setter 와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요없이 부모클래스에 작성한 것을 사용할 수 있다.
    * 따라서 자식 클래스에 추가된 필드에 대해서만 할 수 있다.
    * */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getInformation() {
        /*
        * super.getInformation() : 정상적으로 부모님의 메소드를 호출
        * this.getInformation() : 본인의 getInformation() 호출 -> 재귀호출이 일어나며
        *                         stackoverflow가 발생
        * getInformation() : this.이 자동 추가되어 재귀호출이 일어나고 stackoverflow 발생
        * 따라서 이런 경우 super.을 명시적으로 사용해야 된다.*/
        return super.getInformation()
                +"cpu='" + cpu + '\'' +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'';
    }
}
