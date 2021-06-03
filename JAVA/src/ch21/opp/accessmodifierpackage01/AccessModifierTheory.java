package ch21.opp.accessmodifierpackage01;

public class AccessModifierTheory {
    public static void main(String[] args) {
        /*
            접근제한자

            클래스를 구성하는 것에는 변수, 함수 등이 있다.
            클래스와 클래스 구성 요소에 접근을 제한하는 용도로 사용하는 제어자이다.

            접근제한자는 A 클래스와 B 클래스 사이의 접근 관계를 설정하여 준다.
            이를 통해 A 클래스에 B클래스가 접근할 수 있거나, 접근할 수 없도록 제한을 걸어 둘 수 있다.

            클래스 내부에서만 사용하고자 하는 변수나 메서드에 접근을 막을 수 있다.
            클래스 외부에서의 자료에의 접근을 막을 수 있다.

            접근제한자는 패키지와 클래스의 위치를 통해서 접근 가능 여부를 판단한다.

            접근제한자의 종류
            접근제한자              같은 패키지                         다른 패키지
                            같은 클래스         다른 클래스         상속 클래스     클래스
            public              o                   o                    o           o
            protected           o                   o                    o           x   
            default             o                   o                    x           x
            private             o                   x                    x           x
        */
    }
}
