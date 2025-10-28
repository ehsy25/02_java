package com.rlatjddms.section03.main;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        // Random() > 0.0 >= 값 < 1.0
        //            0.0 * 10 >= 값 < 1.0 * 10
        //            0 >= 값 < 10   +++> 0~9
        // (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값

        // 0~9까지의 난수 생성  > 9 - 0 + 1 = 10
        int random1 = (int) (Math.random() * 10) + 0;
        System.out.println("random1 = " + random1);

        // 1~10까지의 난수 생성  > 10 - 1 + 1 = 10
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        // 10~15까지의 난수 생성  < 16 - 10 + 1 = 6
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        // -128~127까지의 난수 생성  > 127 - (-128) -> 255 + 1 = 256
        int random4 = (int) (Math.random() * 256) + (-128);
        System.out.println("random4 = " + random4);

        /* java.util.Random 클래스 */
        /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */

        /* 원하는 범위의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        Random random = new Random();

        /* 0 부터 9까지 난수 발생 */
        int randomNumber1 = random.nextInt(10);
        System.out.println("0 부터 9 까지의 난수 : " + randomNumber1);

        /* 1부터 10까지 난수 발생 */
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("1 부터 10 까지의 난수 : " + randomNumber2);

        /* 20 부터 45까지의 난수 발생 */
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("20 부터 45 까지의 난수 : " + randomNumber3);

        /* -128 부터 127까지의 난수 발생 */
        //int randomNumber4 = random.nextInt(256) - 128;
        int randomNumber4 = new Random().nextInt(256) - 128;		//객체를 생성하자마자 바로 메소드 호출도 할 수 있다.
        System.out.println("-128 부터 127 까지의 난수 : " + randomNumber4);
    }
}
