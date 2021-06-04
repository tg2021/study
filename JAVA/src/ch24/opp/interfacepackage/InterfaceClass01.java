package ch24.opp.interfacepackage;

public interface InterfaceClass01 {
    /*
        인터페이스
        interface, abstract 등이
        클래스를 만들때 뼈대를 잡아준다.
    */

    // 구현체가 없는 메서드
    public void interfaceMethod();
    
    // 추상메서드
    public abstract void abstractMethod();

    public String OS_NAME = "windows10";
    public final static String DownLoad_PATH = "C:/";

    public class sampleFirst {

        public int sampleCount = 3;
    }
    
    public static class sampleStaticClass {
        public static int staticSampleCount = 1;
    }

    public interface innerInterface {
        public void showMsg();
    }

    public enum D {CREATE, READ, UPDATE, DELETE};

    public default void defaultMethod() {
        System.out.println("기본 메서드입니다. 자바 1.8 이후부터 사용 가능합니다.");
    }

    public static void staticVoidMethod() {
        System.out.println("static 메서드도 사용가능합니다. 자바 1.8 이후부터 사용 가능합니다.");
    }
}
