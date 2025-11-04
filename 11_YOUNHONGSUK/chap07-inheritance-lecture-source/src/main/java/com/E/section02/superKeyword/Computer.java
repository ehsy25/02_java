package com.E.section02.superKeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int ssd;
    private int ram;
    private String os;

    public Computer() {
    }

    public Computer(String cpu, int ssd, int ram, String os) {
        super();
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.os = os;
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

/*
* super.getinfo() = 부모의 메소드 호출
* this.getinfo() = 본인의 메소드를 호출해서 무한반복 stackoverflow
* */
    @Override
    public String getInfo() {
        return super.getInfo() +
                "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }

    public Computer(String code, String brand, String name, int price,
                    Date mfd, String cpu, int ssd, int ram, String os) {
        super(code, brand, name, price, mfd);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.os = os;
        /*
        * */



    }
}
