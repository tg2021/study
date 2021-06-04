package ch25.opp.innerclass;

public class InnerClass01 {
    // inner class
    class instanceInner {

    }
    // static inner class
    static class StaticInner {

    }

    void sampleMethod() {

        // 메서드안에 있는 지역 inner class
        class LocalInstanceClass {

        }
    }
}
