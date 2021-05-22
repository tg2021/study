package ch04.calculator;

public class CalculatorClass05 {
    public static void main(String[] args) {
        // 비교연산자
        int one = 10;
        int two = 5;

        boolean cmpOne = one > two;
        System.out.println("cmpOne : " + cmpOne);

        cmpOne = one < two;
        System.out.println("cmpOne : " + cmpOne);

        cmpOne  = one == two;
        System.out.println("cmpOne : " + cmpOne);

        cmpOne  = one != two;
        System.out.println("cmpOne : " + cmpOne);
    }
}
