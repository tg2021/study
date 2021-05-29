package ch15.opp.constructor;

public class ConstructorOneMain {
    public static void main(String[] args) {
        ConstructorOne constructorOne = new ConstructorOne("intel", "nvd");

        System.out.println("아래는 기본 생성자입니다.");

        ConstructorOne constructorOne1 = new ConstructorOne();
    }
}
