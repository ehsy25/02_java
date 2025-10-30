package com.lhw.section02.userexception.exception;

public class PriceNegativeException extends NegativeException {

    /*
    상속구조를 통해서 나중에 필요로 할 수 있는 다형성을
    염두에 두고 세부로 나눈 것
    원래 상속을 하면 부모의 것을 따라가야한다. 기존에는
    부모에 기본 생성자가 있기 때문에 아무것도 안해도 된다.
    하지만 얘는 지금 부모가 매개변수 생성자를 가지고 있으니
    얘도 매개변수 생성자를 만들어 줘야한다.
    */
    public PriceNegativeException(String message) {
        super(message);
    }
}
