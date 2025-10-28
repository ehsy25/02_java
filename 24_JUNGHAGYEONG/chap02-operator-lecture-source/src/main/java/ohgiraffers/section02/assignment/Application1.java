package ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println("num : " + num);

        //3증가시
        num = num + 3; // 공간(num) = 값(num) + 3
        System.out.println("num : " + num);

        num += 3; // num = num + 3; 과 같은 의미임
        System.out.println("num : " + num);

        num -= 5; // num = num - 5
        System.out.println("num : " + num);

        num *= 2; // num = num * 2
        System.out.println("num : " + num);

        num /= 2; // num = num / 2
        System.out.println("num : " + num);

        num %= 10; // num = num % 2
        System.out.println("num : " + num);

        // 주의!!
        num =- 5; // eual(=) 기호 오른쪽은 복합 대입연산자 XX
        System.out.println("num : " + num);

    }
}
