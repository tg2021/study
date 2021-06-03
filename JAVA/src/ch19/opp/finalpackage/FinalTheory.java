package ch19.opp.finalpackage;

public class FinalTheory {
    /*
        final

        변수, 메서드, 클래스에 final이 붙으면,
        해당 요소는 더 이상 변경을 하지 못한다


        final 변수

        대입연산자 [=]를 통하여 반드시 초기화가 이루어져야 하며
        초기화 이후에는 값의 변경이 불가능하다.
        값의 변경이 불가능하다는 것은 기본형 변수는 값의 변경이 불가능하고,
        참조형 변수는 변수의 메모리 주소 변경이  불가능하다.

        final변수는 메서드의 파라미터로도 사용가능하다.


        final 매서드

        final 메서드는 상속 이후에 다시 정의하는 것을 할 수 없다.
        Overriding을 할 수 없다.


        final 클래스

        final이 붙은 클래스로는 상속을 해줄 수 없다.


        시스템 내부 설정에서 final

        public static final을 시스템 내부 설정 값에 활용한다.
        모든 객체에 동일하게 적용되야 해서 static
        해당 변수에서만 값을 변경할 수 있어야 하기 때문에 final
        public을 붙여서 외부에서 접근이 자유로워야 하기 때문에 public
    */

}
