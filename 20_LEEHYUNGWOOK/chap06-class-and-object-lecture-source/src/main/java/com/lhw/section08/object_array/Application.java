package com.lhw.section08.object_array;

public class Application {

    public static void main(String[] args) {

        /* 기존 방법 */
        Car lamborgini = new Car("lamborgini", 300);
        Car porche =     new Car("porche", 380);
        Car bugatti =    new Car("bugatti", 400);
        Car f1 =         new Car("f1", 500);
        Car porter =     new Car("porter", 110);

//        lamborgini.driveMaxSpeed();
//        porche.driveMaxSpeed();
//        bugatti.driveMaxSpeed();
//        f1.driveMaxSpeed();
//        porter.driveMaxSpeed();

        Car[] carArr = new Car[5];
        carArr[0] = new Car("람보르기니", 300);
        carArr[1] = new Car("lamborgini", 300);
        carArr[2] = new Car("porche", 380);
        carArr[3] = new Car("bugatti", 400);
        carArr[4] = new Car("f1", 500);
        System.out.println(carArr.hashCode());
        System.out.println(carArr[0].hashCode());
        /*배열이니 for 문을 이용해서 객체에 접근한다.*/
        for(Car car : carArr){
            // car = carArr[x] -> 객체 주소값
            car.driveMaxSpeed();
        }
    }
}
