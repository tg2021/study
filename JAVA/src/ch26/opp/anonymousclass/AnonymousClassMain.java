package ch26.opp.anonymousclass;

public class AnonymousClassMain {
    public static void main(String[] args) {
        
        new AnonymousClass() {

            @Override
            public String returnCompanyName() {
                return super.returnCompanyName();
            }
            
        };

        new AnonymousClass("Korea Gas") {
            @Override
            public String returnCompanyName() {
                return super.returnCompanyName();
            }
            
        };

        new Runnable() {
            // 인터페이스를 이용한 익명클래스 활용
            // Runnable 인테페이스는 쓰레드를 쓸때 활용하는 대표적인 인터페이스
            @Override
            public void run() {
                
                
            }
            
        };
    }
}
