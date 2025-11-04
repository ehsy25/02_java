package com.lhw.section06.finalkeyword;

public class FinalFieldTest {

    /* final 키워드를 사용할 수 있는 위치는 다양하다.
     * 1. 지역 변수 : 초기화 이후 값 변경 불가
     * 2. 매개 변수 : 호출 시 전달한 값 변경 불가
     * 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후에 값 변경 불가
     * 4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
     * 5. non-static method : 메소드 재작성(오버라이딩) 불가
     * 6. static method : 메소드 재작성(오버라이딩) 불가
     * 7. 클래스 : 상속 불가
     * */

    /*non-static field에 final 사용하는 경우
    * 초기 인스턴스 생성 시 기본값 0이 필드에 들어가게 되는데 값 변경이
    * 분가능하므로 선언과 동시에 초기화를 해야한다.*/
    private final int NON_STATIC_NUM = 1;

    private final String NON_STATIC_NAME; //-> 값 할당을 해주지 않으면 NULL 값이라 오류뜬다.
    public FinalFieldTest(String nonStaticName) {
        /*그래서 인스턴스가 생성될 때(생성자를 통해) 값을 지정해줄 수 있다.
        * 이는 논-스태틱일 경우에만 사용한다.*/
        this.NON_STATIC_NAME = nonStaticName;
    }

    /*Static field에 final 사용할 경우*/
    private final int STATIC_NUM = 1;

    private static final String STATIC_NAME;
    /* 생성자로 static final 변수를 설정해줄 수 없으니 아래
    *  static 초기화 블럭을 사용할 수 있다.*/
    static{
        STATIC_NAME = "홍길동";
    };

    /*final 과 static 키워드의 나열 순서는 문법적으로 상관없다.
    * 다만 주로 static final로 작성*/
    public final static int MIN = 1;
    public static final int MAX = 100;
}
