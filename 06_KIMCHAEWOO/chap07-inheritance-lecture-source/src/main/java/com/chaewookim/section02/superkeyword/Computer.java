package com.chaewookim.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    // Computer는 하나의 Product이지만 Product는 Computer가 안임
    // 현재 IS-A 관계 성립
    private String cpu;
    private int ssd;
    private int ram;
    private String operationSystem;

    public Computer() {

        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }


    @Override
    public String getInformation() {
        return super.getInformation()
                + ", cpu = " + this.cpu
                + ", ssd = " + this.ssd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.getOperationSystem();
    }

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

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
