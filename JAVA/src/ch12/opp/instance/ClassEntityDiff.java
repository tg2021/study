package ch12.opp.instance;

public class ClassEntityDiff {
    
    int normalValue = 10;
    static int staticValue = 20;

    // 전역변수에 static전역변수를 담을 수 있다
    int normalValue2 = staticValue;

    // static전역변수에 전역변수를 담을 수 없다.
    // static int staticValue2 = normalValue;

    static void callStaticMethod() {
        // static 메서드 내부에서는 static변수만 사용가능
        System.out.println(staticValue);
        //System.out.println(normalValue);
        
    }

    void callNormalMethod() {
        System.out.println(staticValue);
        System.out.println(normalValue);
    }

    static void sampleStaticMethod() {
        System.out.println("스테틱 메서드.");
    }

    void sampleNormalMethod() {
        System.out.println("일반 메서드.");
    }

    static void doStaticMethod() {
        sampleStaticMethod();
        //sampleNormalMethod();
    }

    void doNormalMrthod() {
        sampleStaticMethod();
        sampleNormalMethod();
    }
}
