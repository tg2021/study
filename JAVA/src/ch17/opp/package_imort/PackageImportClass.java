package ch17.opp.package_imort;

public class PackageImportClass {
    public static void main(String[] args) {
        
        /*
            클래스의 묶음.

            클래스 또는 인터페이스를 포함시킬 수 있다.
            클래스 이름이 같아도 다른 패키지에는 같은 이름의 클래스들이 존재할 수 있다.
            윈도우의 경로 체계 개념과 유사하다.
            여러 명의 개발자가 개발할 때는 자신만의 패키지 묶음을 유지하여
            다른 개발자와의 중복 충돌을 피할 수 있다.
        */

        /*
            패키지 작성법

            패키지명은 소문자로 작성하는 것이 추천되는 방식이다.


            이름없는 패키지

            아무런 패키지에 속하지 않는 자바 파일을 만들면
            이름없는 패키지에 속하게 됨.


            import
            
            여러개 선언이 가능하다.
            마지막에 .*; 형식으로 통합적인 선언이 가능하다.

            package
            import
            class 순

            static import

            static import를 사용하면 static 클래스를 호출할 때 편리하게 사용이 가능하다.
        */
    }
}
