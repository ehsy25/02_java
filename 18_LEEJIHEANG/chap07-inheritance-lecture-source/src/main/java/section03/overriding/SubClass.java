package section03.overriding;

public class SubClass extends SuperClass {
    @Override
    public void method(int num) {}
//    public void method(String num){}
//public int method (int num) { return 0;}
//public void method2(int num) {}

    /*private 메소드 오버라이딩 불가*/
//    @Override
//    private void privateMethod(){}

    /* fianal 메소드 오버라이딩 불가*/
//    @Override
//    public void finalMethod(){}

    /*protected - > default로 변경 : 보다 좁은 범위로 변경하는 것은 불가능*/
//    @Override
//    void protectedMethod(){}
    /*protected - > public로 변경 : 보다 넓은 범위로 변경하는 것은 가능*/
    @Override
    public void protectedMethod(){}

}
