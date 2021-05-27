package ch09.opp.method;

public class methodClass02CallTest {
    public static void main(String[] args) {
        
        int sumRtn = sumLogic(1, 2);
        System.out.println("sumRtn : " + sumRtn);

        methodClass02.sayHello();

        methodClass02 acmt = new methodClass02();
        acmt.sayRoger();
    }

    public static int sumLogic(int one, int two) {
        int sum = one + two;
        return sum;
    }
}
