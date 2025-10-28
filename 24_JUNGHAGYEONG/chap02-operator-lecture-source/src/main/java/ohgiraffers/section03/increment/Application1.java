package ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        int num = 20;
        System.out.println("num : " + num);

        num++;		//1 증가
        System.out.println("num : " + num);

        ++num;		//1 증가
        System.out.println("num : " + num);

        num--;		//1 감소
        System.out.println("num : " + num);

        --num;		//1 감소
        System.out.println("num : " + num);

        System.out.println("-------------------------");
        int firstNum = 20;

        int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;			//증가를 먼저 처리하고 난 뒤 다른 연산을 함

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++; // 10(11)
        System.out.println("addNum : " + addNum); // 10
        System.out.println("num1 = " + num1); // 11

        System.out.println("-------------------------");
        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b; // 3 + 4(4) : a = 3 b = 5 c = -1 d = 7
        b = 2 * (-c + a++) - d; // 2 * (-(-1) + 3) - 7 : a = 4 b = 1 c = -1 d = 7
        c *= 2; // a = 4 b = 1 c = -2 d = 7
        a = b++ + c; //a = -1 b = 2 c = -2 d = 7

        System.out.println("a = " + a); // -1
        System.out.println("b = " + b); // 2
        System.out.println("c = " + c); // -2
        System.out.println("d = " + d); // 7

    }
}
