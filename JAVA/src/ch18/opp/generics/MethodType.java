package ch18.opp.generics;

public class MethodType {
    
    public <T> T aMethod(T t) {
        return null;
    }

    // 패키지가 다르면 import해야 사용가능
    public <T> T bMethod(Alpha02<T> a) {
        return null;
    }

    public static <T> T cMethod (T t) {
        return null;
    }

    public static <T> T dMethod (Alpha02<T> alpha02) {
        return null;
    }
}
