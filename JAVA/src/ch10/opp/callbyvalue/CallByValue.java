package ch10.opp.callbyvalue;

public class CallByValue {
    public static void main(String[] args) {
        
        /*
        Call by value 
        메서드 호출 시에 사용되는 인자의 메모리에 저장되어 있는 값(value)을 복사하여 보낸다.
        */
        int first = 3;
        int second = first;

        int third = doSomthing(first);
        System.out.println("동일 변수 비교 : " + (first == second));
        System.out.println("메서드로 계산된 값 : " + third);

        InnerClass1 innerClass1 = new InnerClass1();
        InnerClass1 innerClass2 = innerClass1;

        InnerClass1 innerClass3 = makeNewEntity(innerClass1);
        System.out.println("동일 객체 비교 : " + (innerClass1 == innerClass2));
        System.out.println(innerClass1);
        System.out.println(innerClass2);
        System.out.println("1번과 3번 비교 : " + (innerClass1 == innerClass3));
        System.out.println();
        System.out.println(innerClass1);
        System.out.println(innerClass3);
    }

    public static class InnerClass1 {

    }
    public static int doSomthing(int one) {
        one++;
        return one;
    }
    public static InnerClass1 makeNewEntity(InnerClass1 innerClass1) {
        innerClass1 = new  InnerClass1();
        return innerClass1;
    }
}
