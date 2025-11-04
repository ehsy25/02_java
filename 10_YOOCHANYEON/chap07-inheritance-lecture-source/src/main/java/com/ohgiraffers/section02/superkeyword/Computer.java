package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    /* Computer는 하나의 Product이지만 Product는 Computer가 아니므로 'is-a 관계' 성립*/
    private String cpu;
    private String ram;
    private String ssd;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, String ram, String ssd, String operationSystem) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price,
                    Date manufacturingDate, String cpu, String ram,
                    String ssd, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.operationSystem = operationSystem;
//        this(cpu, ssd, ram, operationSystem);
        /*
        * this()로 인해 작성한 생성자를 호출한다는 의미는
        * super()를 두 번 호출하는 것과 같기에 허용 x
        * 부모 생성자는 한 번만 호출 가능 (this 생성자와 같이 사용 x)
        * */
    }

    /*
    * setter와 getter는 부모 필드의 메소드에 대해서 자신의 것처럼 사용 가능하기 때문에
    * 따로 작성할 필요 없이 부모 클래스에 작성한 것을 사용 가능
    * 따라서 자기 클래스에 추가된 필드에 대해서만 setter/getter를 작성
    * */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfo() {
        /*
        * super.getInformation() : 정상적으로 부모의 메소드를 호출
        * this.getInformation() : 본인의 getInformation() 호출 -> 재귀 호출이 일어나며
        *                          stackoverflow가 발생
        * getInformation() : this.이 자동 추가되어 재귀 호출이 일어나고 stackoverflow 발생
        * 따라서 이런 경우 super.을 명시적으로 사용해야 함
        * */
        return super.getInfo() +
                ", cpu = '" + this.cpu + '\'' +
                ", ram = '" + this.ram + '\'' +
                ", ssd = '" + this.ssd + '\'' +
                ", operationSystem = '" + this.operationSystem + '\'' +
                '}';
    }
}
