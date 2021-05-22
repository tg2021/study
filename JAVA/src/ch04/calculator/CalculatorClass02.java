package ch04.calculator;

public class CalculatorClass02 {
    public static void main(String[] args) {
        // 축약형
        int intVar1 = 10;
        int intVar2 = 2;
        intVar1 += intVar2;
        System.out.println("intVar1 : " + intVar1);
        
        // 풀어쓴 것
        intVar1 = 10;
        intVar2 = 2;
        intVar1 = intVar1 + intVar2;
        System.out.println("intVar1 : " + intVar1);

        // 축약형
        intVar1 = 10;
        intVar2 = 2;
        intVar1 -= intVar2;
        System.out.println("intVar1빼기 : " + intVar1);

        // 축약형
        intVar1 = 10;
        intVar2 = 2;
        intVar1 *= intVar2;
        System.out.println("intVar1곱하기 : " + intVar1);

        // 풀어쓴 것
        intVar1 = 10;
        intVar2 = 2;
        intVar1 = intVar1 * intVar2;
        System.out.println("intVar1곱하기 풀어쓰기 : " + intVar1);

        // 축약형
        intVar1 = 10;
        intVar2 = 3;
        intVar1 %= intVar2;
        System.out.println("intVar1나누고 남은 나머지 : " + intVar1);
    }
}
