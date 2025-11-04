package com.lhw.section06.singleton;

public class EagerSingleton {
    /*인스턴스를 먼저 만들고, 막은 뒤 재사용을 막아버리는 방법*/
    public static EagerSingleton eager = new EagerSingleton();

    // 기본생성자를 막아버림
    // 이제 외부에서 작성 못함 -> Final 안붙여도 됨
    private EagerSingleton(){}

    // 외부에서 사용은 가능하게 해준다.
    // 재사용 가능하다.
    public static EagerSingleton getInstance(){
        return eager;
    }
}
